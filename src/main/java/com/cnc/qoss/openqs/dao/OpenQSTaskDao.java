package com.cnc.qoss.openqs.dao;

import com.cnc.qoss.openqs.entity.mysqlObj.OpenQSTask;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OpenQSTaskDao {
    int deleteByPrimaryKey(String id);

    int insert(OpenQSTask record);

    int insertSelective(OpenQSTask record);

    OpenQSTask selectByPrimaryKey(String id);

    List<OpenQSTask> selectAll();

    int updateByPrimaryKeySelective(OpenQSTask record);

    int updateByPrimaryKey(OpenQSTask record);

    int loadData();
}