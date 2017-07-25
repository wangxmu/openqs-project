package com.cnc.qoss.openqs.entity.mysqlObj;

/**
 * Created by wangyong on 2017/3/3.
 */
public class TaskEmit {
    private String id;
    private Integer lastsuccessTime;
    private String url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getLastsuccessTime() {
        return lastsuccessTime;
    }

    public void setLastsuccessTime(Integer lastsuccessTime) {
        this.lastsuccessTime = lastsuccessTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
