package com.mooc.ppjoke.ui;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.paging.DataSource;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;

//触发加载数据
public abstract class AbsViewModel<T> extends ViewModel {


    protected PagedList.Config config;
    private DataSource dataSource;
    private LiveData<PagedList<T>> liveDataPageList;

    private MutableLiveData<Boolean> boundaryPageData = new MutableLiveData<>();

    public AbsViewModel() {

        config = new PagedList.Config.Builder()
                .setPageSize(10)
                .setInitialLoadSizeHint(10)
                // .setMaxSize(100)；
                // .setEnablePlaceholders(false)
                .setPrefetchDistance(10)
                .build();

        //只需要调用observe方法就可以出发加载数据
        //这里返回的data是ComputableLiveData的LiveData,所以adapter只需要监听这里LiveData，就知道网络请求有没数据回来
        liveDataPageList = new LivePagedListBuilder(factory, config)
                .setInitialLoadKey(0)
                //.setFetchExecutor()
                .setBoundaryCallback(callback)
                .build();
        Log.e("TAG", "AbsViewModel AbsViewModel liveDataPageList build成功:" );
    }


    public LiveData<PagedList<T>> getLiveDataPageList() {
        return liveDataPageList;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public LiveData<Boolean> getBoundaryPageData() {
        return boundaryPageData;
    }

    //PagedList数据被加载 情况的边界回调callback
    //但 不是每一次分页 都会回调这里，具体请看 ContiguousPagedList#mReceiver#onPageResult
    //deferBoundaryCallbacks
    PagedList.BoundaryCallback<T> callback = new PagedList.BoundaryCallback<T>() {
        @Override
        public void onZeroItemsLoaded() {
            //新提交的PagedList中没有数据
            Log.e("TAG", "AbsViewModel 新提交的PagedList中没有数据 onZeroItemsLoaded:" );
            boundaryPageData.postValue(false);
        }

        @Override
        public void onItemAtFrontLoaded(@NonNull T itemAtFront) {
            //新提交的PagedList中第一条数据被加载到列表上()
            Log.e("TAG", "AbsViewModel  第一条数据被加载到列表上 onItemAtFrontLoaded:" );
            boundaryPageData.postValue(true);
        }

        @Override
        public void onItemAtEndLoaded(@NonNull T itemAtEnd) {
            //新提交的PagedList中最后一条数据被加载到列表上
        }
    };

    DataSource.Factory factory = new DataSource.Factory() {
        @NonNull
        @Override
        public DataSource create() {
            if (dataSource == null || dataSource.isInvalid()) {
                Log.e("TAG", "AbsViewModel create createDataSource:" );
                dataSource = createDataSource();
            }
            return dataSource;
        }
    };

    public abstract DataSource createDataSource();


    //可以在这个方法里 做一些清理 的工作
    @Override
    protected void onCleared() {

    }
}
