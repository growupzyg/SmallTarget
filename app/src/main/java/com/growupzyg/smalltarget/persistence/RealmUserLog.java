package com.growupzyg.smalltarget.persistence;

import io.realm.RealmObject;

/**
 * Created by ZhangYige on 2018/1/9.
 * 用户发布记录日志
 */

public class RealmUserLog extends RealmObject {
    private String userId;//用户id
    private String content;//内容
    private String imageUrl;//图片地址
    private String timeStamp;//时间戳

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
