package com.cnc.qoss.openqs.dao;

import com.cnc.qoss.openqs.entity.mysqlObj.OpenQSTaskGroup;
import org.springframework.stereotype.Component;

@Component
public interface OpenQSTaskGroupDao {
    int deleteByPrimaryKey(String taskgroupId);

    int insert(OpenQSTaskGroup record);

    int insertSelective(OpenQSTaskGroup record);

    OpenQSTaskGroup selectByPrimaryKey(String taskgroupId);

    int updateByPrimaryKeySelective(OpenQSTaskGroup record);

    int updateByPrimaryKey(OpenQSTaskGroup record);

    int loadData();

    int updateLastSuccessTime(OpenQSTaskGroup record);
}