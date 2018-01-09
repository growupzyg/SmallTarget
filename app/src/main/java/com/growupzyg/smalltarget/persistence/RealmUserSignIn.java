package com.growupzyg.smalltarget.persistence;

import io.realm.RealmObject;

/**
 * Created by ZhangYige on 2018/1/9.
 * 用户打卡日志
 */

public class RealmUserSignIn extends RealmObject {
    private String userId;//用户id
    private String timestamp;//打卡日期
    private boolean state;//是否有效

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
