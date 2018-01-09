package com.growupzyg.smalltarget;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by ZhangYige on 2018/1/9.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
