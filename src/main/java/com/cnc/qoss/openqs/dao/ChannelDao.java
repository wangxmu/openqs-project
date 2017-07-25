package com.cnc.qoss.openqs.dao;

import com.cnc.qoss.openqs.entity.mysqlObj.Channel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ChannelDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Channel record);

    int insertSelective(Channel record);

    Channel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Channel record);

    int updateByPrimaryKey(Channel record);

    List<Channel> selectAll();
}