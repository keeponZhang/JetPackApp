package com.mooc.ppjoke.ui.login;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.mooc.libcommon.global.AppGlobals;
import com.mooc.libnetwork.ApiResponse;
import com.mooc.libnetwork.ApiService;
import com.mooc.libnetwork.JsonCallback;
import com.mooc.libnetwork.cache.CacheManager;
import com.mooc.ppjoke.model.User;

public class UserManager {
    private static final String KEY_CACHE_USER = "cache_user";
    private static UserManager mUserManager = new UserManager();

    public MutableLiveData<User> getUserLiveData() {
        return userLiveData;
    }

    private MutableLiveData<User> userLiveData = new MutableLiveData<>();
    private User mUser;

    public static UserManager get() {
        return mUserManager;
    }

    private UserManager() {
        // User cache = (User) CacheManager.getCache(KEY_CACHE_USER);
        // if (cache != null && cache.expires_time > System.currentTimeMillis()) {
        //     mUser = cache;
        // }
    }

    public void save(User user) {
        mUser = user;
        CacheManager.save(KEY_CACHE_USER, user);
        if (userLiveData.hasObservers()) {
            Log.e("TAG",
                    "UserManager save 更新数据啦 -------------------------- mUser:"+mUser+"  " +
                            "userLiveData.getObserversSize()= "+userLiveData.getObserversSize() );
            userLiveData.postValue(user);
        }
    }

    public LiveData<User> login(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
        return userLiveData;
    }

    public boolean isLogin() {
        return mUser == null ? false : mUser.expires_time > System.currentTimeMillis();
    }

    public User getUser() {
        return isLogin() ? mUser : null;
    }

    public long getUserId() {
        return isLogin() ? mUser.userId : 0;
    }


    public LiveData<User> refresh() {
        if (!isLogin()) {
            return login(AppGlobals.getApplication());
        }
        final MutableLiveData<User> liveData = new MutableLiveData<>();
        ApiService.get("/user/query")
                .addParam("userId", getUserId())
                .execute(new JsonCallback<User>() {
                    @Override
                    public void onSuccess(ApiResponse<User> response) {
                        Log.w("TAG", "UserManager onSuccess 刷新数据 getUser():" +getUser());
                        save(response.body);
                        // liveData.postValue(getUser());
                    }

                    @Override
                    public void onError(final ApiResponse<User> response) {
                        ArchTaskExecutor.getMainThreadExecutor().execute(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(AppGlobals.getApplication(), response.message, Toast.LENGTH_SHORT).show();
                            }
                        });
                        Log.e("TAG", "UserManager onError postValue null: " );
                        liveData.postValue(null);
                    }
                });
        return liveData;
    }

    public void logout() {
        CacheManager.delete(KEY_CACHE_USER, mUser);
        mUser = null;
    }
}
