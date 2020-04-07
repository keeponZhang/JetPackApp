package com.mooc.ppjoke.ui.home;

import android.os.SystemClock;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.lifecycle.MutableLiveData;
import androidx.paging.DataSource;
import androidx.paging.ItemKeyedDataSource;
import androidx.paging.PageKeyedDataSource;
import androidx.paging.PagedList;

import com.alibaba.fastjson.TypeReference;
import com.mooc.libnetwork.ApiResponse;
import com.mooc.libnetwork.ApiService;
import com.mooc.libnetwork.JsonCallback;
import com.mooc.libnetwork.Request;
import com.mooc.ppjoke.ui.AbsViewModel;
import com.mooc.ppjoke.model.Feed;
import com.mooc.ppjoke.ui.MutablePageKeyedDataSource;
import com.mooc.ppjoke.ui.login.UserManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

//https://www.jianshu.com/p/14af4b8c29e3
// 通过LiveData作为中介者，实现了UI组件和数据组件的隔离，对于UI组件来说，它只负责 发起请求操作 和 在数据变化的时候更新界面，而对于数据组件来说，它负责 接受请求和 改变LiveData,数据组件也可以在viewModel实现
public class HomeViewModel extends AbsViewModel<Feed> {

    private volatile boolean witchCache = true;
    private MutableLiveData<PagedList<Feed>> cacheLiveData = new MutableLiveData<>();

    //同步位标记，防止框架已经帮我们做了加载更多了，系统调用时调用dataSource的loadAfter
    private AtomicBoolean loadAfter = new AtomicBoolean(false);
    private String mFeedType;

    @Override
    public DataSource createDataSource() {
        return new FeedDataSource();
    }

    public MutableLiveData<PagedList<Feed>> getCacheLiveData() {
        return cacheLiveData;
    }

    public void setFeedType(String feedType) {

        mFeedType = feedType;
    }

    //数据源，也是放在viewmodel处理（或者单独用数据处理类）
    //ItemKeyedDataSource：适用于目标数据的加载依赖特定item的信息，比较常用
    //PageKeyedDataSource:适用于目标数据根据页信息请求数据
    //PositionalDataSource：适用于目标数据总数固定，通过特定的位置加载数据

    //DataSource<Key, Value>Key是用来帮助开发者进行数据的组合以及请求的变化,会在请求开始和过程中传递给开发者,Key的类型和值由开发者决定
    class FeedDataSource extends ItemKeyedDataSource<Integer, Feed> {
        //这里是创建dataSource,然后回调到loadInitial，发起数据请求
        @Override
        public void loadInitial(@NonNull LoadInitialParams<Integer> params, @NonNull
               LoadInitialCallback<Feed> callback) {
            //加载初始化数据的
            Log.w("TAG", "homeviewmodel loadInitial 初始化数据啦 params.requestedLoadSize: "+params.requestedLoadSize);
            loadData(0, params.requestedLoadSize, callback);
            witchCache = false;
        }


        @Override
        public void loadAfter(@NonNull LoadParams<Integer> params, @NonNull LoadCallback<Feed> callback) {
            //向后加载分页数据的
            Log.w("TAG", "homeviewmodel loadAfter params.key: "+params.key);
            loadData(params.key, params.requestedLoadSize, callback);
        }

        @Override
        public void loadBefore(@NonNull LoadParams<Integer> params, @NonNull LoadCallback<Feed> callback) {
            callback.onResult(Collections.emptyList());
            //能够向前加载数据的
        }

        @NonNull
        @Override
        public Integer getKey(@NonNull Feed item) {
            Log.w("TAG", "FeedDataSource getKey 获取key咯:" );
            return item.id;
        }
    }

    private void loadData(int key, int count, ItemKeyedDataSource.LoadCallback<Feed> callback) {
        if (key > 0) {
            loadAfter.set(true);
        }
        //feeds/queryHotFeedsList
        Request request = ApiService.get("/feeds/queryHotFeedsList")
                .addParam("feedType", mFeedType)
                .addParam("userId", UserManager.get().getUserId())
                .addParam("feedId", key)
                .addParam("pageCount", count)
                .responseType(new TypeReference<ArrayList<Feed>>() {
                }.getType());
        witchCache = false;
        if (witchCache) {
            request.cacheStrategy(Request.CACHE_ONLY);
            request.execute(new JsonCallback<List<Feed>>() {
                @Override
                public void onCacheSuccess(ApiResponse<List<Feed>> response) {
                    //这样有可能缓存覆盖了网络数据
                    // SystemClock.sleep(4000);

                    //转换pagelist不是直接new出来pagelist
                    Log.w("TAG", "loadData 获取缓存 onCacheSuccess: "+response);
                    MutablePageKeyedDataSource dataSource = new MutablePageKeyedDataSource<Feed>();
                    //这样缓存数据与dataSource关联起来
                    dataSource.data.addAll(response.body);

                    //这里也是用PagedList.Builder通过dataSource和config来创建pageList
                    PagedList pagedList = dataSource.buildNewPagedList(config);
                    cacheLiveData.postValue(pagedList);
                    // pagedList.add(pagedList.get(pagedList.size()-1));
                    // cacheLiveData.postValue(pagedList);

                    //不能直接new，一般是调用create方法创建
                    // new PagedList<Feed>()


                    //下面的不可取，否则会报
                    // java.lang.IllegalStateException: callback.onResult already called, cannot call again.
                    //if (response.body != null) {
                    //  callback.onResult(response.body);
                    // }
                }
            });
        }

        try {
            Request netRequest = witchCache ? request.clone() : request;
            netRequest.cacheStrategy(key == 0 ? Request.NET_CACHE : Request.NET_ONLY);
            //首页的数据才缓存
            ApiResponse<List<Feed>> response = netRequest.execute();
            List<Feed> data = response.body == null ? Collections.emptyList() : response.body;
            Log.e("TAG",
                    "HomeViewModel loadData 同步获取数据成功"+"  key="+key + " data.size:"+data.size());
            //call返回的是普通List
            callback.onResult(data);

            if (key > 0) {
                //通过BoundaryPageData发送数据 告诉UI层 是否应该主动关闭上拉加载分页的动画
                ((MutableLiveData) getBoundaryPageData()).postValue(data.size() > 0);
                loadAfter.set(false);
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }

    public void loadAfter(int id, ItemKeyedDataSource.LoadCallback<Feed> callback) {
        if (loadAfter.get()) {
            callback.onResult(Collections.emptyList());
            return;
        }
        ArchTaskExecutor.getIOThreadExecutor().execute(new Runnable() {
            @Override
            public void run() {
                loadData(id, config.pageSize, callback);
            }
        });
    }
}