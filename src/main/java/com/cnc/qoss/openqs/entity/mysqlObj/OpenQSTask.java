package com.cnc.qoss.openqs.entity.mysqlObj;

/**
 * Created by wangyong on 2017/2/23.
 */
public class OpenQSTask {
    private String id;

    private String name;

    private Integer http;

    private String url;

    private Integer status;

    private String ip;

    private String taskgroupId;

    private Integer channelId;

    private String cdnName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getHttp() {
        return http;
    }

    public void setHttp(Integer http) {
        this.http = http;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getTaskgroupId() {
        return taskgroupId;
    }

    public void setTaskgroupId(String taskgroupId) {
        this.taskgroupId = taskgroupId == null ? null : taskgroupId.trim();
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getCdnName() {
        return cdnName;
    }

    public void setCdnName(String cdnName) {
        this.cdnName = cdnName == null ? null : cdnName.trim();
    }

    @Override
    public String toString() {
        return "\"" + "0" + "\"" + "," + "\"" + this.getId() + "\"" + "," + "\"" + this.getName() + "\"" + "," + "\"" + this.getHttp().toString() + "\"" + "," + "\"" + this.getUrl() + "\"" + "," + "\"" + this.getStatus().toString() + "\"" + "," + "\"" + this.getIp() + "\"" + "," + "\"" + this.getTaskgroupId() + "\"" + "," + "\"" + this.getChannelId() + "\"" + "," + "\"" + this.getCdnName() + "\"" + "\n";
    }
}