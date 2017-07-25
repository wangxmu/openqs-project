package com.cnc.qoss.openqs.dao;

import com.cnc.qoss.openqs.entity.mysqlObj.OpenQSThresholdConfig;
import org.springframework.stereotype.Component;


@Component
public interface OpenQSThresholdConfigDao {
    int deleteByPrimaryKey(Integer id);

    int insert(OpenQSThresholdConfig record);

    int insertSelective(OpenQSThresholdConfig record);

    OpenQSThresholdConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OpenQSThresholdConfig record);

    int updateByPrimaryKey(OpenQSThresholdConfig record);

    int loadData();
}