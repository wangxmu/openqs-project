package com.cnc.qoss.openqs.entity.jsonObj;

/**
 * Created by wangyong on 2017/2/28.
 */
public class Task {
    private String http;
    private String id;
    private String ip;
    private String name;
    private String status;
    private String url;
    private String cdnName;

    public Task() {
    }

    public Task(String http, String id, String ip, String name, String status, String url) {

        this.http = http;
        this.id = id;
        this.ip = ip;
        this.name = name;
        this.status = status;
        this.url = url;
    }

    public String getHttp() {
        return http;
    }

    public void setHttp(String http) {
        this.http = http;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCdnName() {
        return cdnName;
    }

    public void setCdnName(String cdnName) {
        this.cdnName = cdnName;
    }
}
