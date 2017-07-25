package com.cnc.qoss.openqs.dao;

import com.cnc.qoss.openqs.entity.mysqlObj.OpenQSAccount;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OpenQSAccountDao {
    int deleteByPrimaryKey(Integer id);

    int insert(OpenQSAccount record);

    int insertSelective(OpenQSAccount record);

    OpenQSAccount selectByPrimaryKey(Integer id);

    List<OpenQSAccount> selectAll();

    int updateByPrimaryKeySelective(OpenQSAccount record);

    int updateByPrimaryKey(OpenQSAccount record);

    int loadData();
}