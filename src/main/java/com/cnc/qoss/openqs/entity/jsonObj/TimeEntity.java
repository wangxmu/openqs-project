package com.cnc.qoss.openqs.entity.jsonObj;

/**
 * Created by wangyong on 2017/2/28.
 */
public class TimeEntity {
    private String beginTime;
    private String endTime;

    public TimeEntity() {
    }

    public TimeEntity(String beginTime, String endTime) {

        this.beginTime = beginTime;
        this.endTime = endTime;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
