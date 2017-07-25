package com.cnc.qoss.openqs.entity.mysqlObj;

public class Channel {
    private Integer id;

    private String name;

    private Integer appGroupId;

    private String customer;

    private Integer hash;

    private Integer dbSuffix;

    private Integer tbSuffix;

    private Integer productLine;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAppGroupId() {
        return appGroupId;
    }

    public void setAppGroupId(Integer appGroupId) {
        this.appGroupId = appGroupId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    public Integer getHash() {
        return hash;
    }

    public void setHash(Integer hash) {
        this.hash = hash;
    }

    public Integer getDbSuffix() {
        return dbSuffix;
    }

    public void setDbSuffix(Integer dbSuffix) {
        this.dbSuffix = dbSuffix;
    }

    public Integer getTbSuffix() {
        return tbSuffix;
    }

    public void setTbSuffix(Integer tbSuffix) {
        this.tbSuffix = tbSuffix;
    }

    public Integer getProductLine() {
        return productLine;
    }

    public void setProductLine(Integer productLine) {
        this.productLine = productLine;
    }
}