package com.cnc.qoss.openqs.entity.mysqlObj;

/**
 * Created by wangyong on 2017/2/23.
 */
public class OpenQSThresholdConfig {
    private Integer id;

    private Integer businessType;

    private Integer type;

    private Double value;

    private Integer compareType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Integer getCompareType() {
        return compareType;
    }

    public void setCompareType(Integer compareType) {
        this.compareType = compareType;
    }
}