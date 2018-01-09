package com.growupzyg.smalltarget.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import io.realm.Realm;

/**
 * Created by ZhangYige on 2018/1/8.
 */

public class BaseActivity extends AppCompatActivity {
    private Realm realm;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        realm = Realm.getDefaultInstance();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(realm != null && !realm.isClosed()){
            realm.close();
        }
    }

    /**
     * 获取Realm 实例
     * @return
     */
    protected Realm getRealm(){
        return realm;
    }
}
