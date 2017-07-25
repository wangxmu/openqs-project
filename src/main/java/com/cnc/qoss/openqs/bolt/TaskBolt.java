package com.cnc.qoss.openqs.bolt;

import backtype.storm.task.OutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichBolt;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Tuple;
import backtype.storm.tuple.Values;
import com.alibaba.fastjson.JSON;
import com.cnc.dna.api.openQS.TaskManage.v1.ApiResult;
import com.cnc.dna.api.openQS.TaskManage.v1.TaskGroupType;
import com.cnc.dna.api.openQS.TaskManage.v1.TaskManage;
import com.cnc.dna.api.openQS.TaskManage.v1.TaskQueryParam;
import com.cnc.dna.platform.core.ServiceManager;
import com.cnc.qoss.openqs.common.ConfUtil;
import com.cnc.qoss.openqs.dao.*;
import com.cnc.qoss.openqs.dataSource.MultipleDataSource;
import com.cnc.qoss.openqs.entity.jsonObj.Task;
import com.cnc.qoss.openqs.entity.jsonObj.TaskGroup;
import com.cnc.qoss.openqs.entity.jsonObj.TimeEntity;
import com.cnc.qoss.openqs.entity.mysqlObj.*;
import com.google.common.collect.Sets;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

import javax.annotation.Resource;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by wangyong on 2017/02/21.
 */
public class TaskBolt extends BaseRichBolt {

    private static Logger LOG = Logger.getLogger(TaskBolt.class);
    private OutputCollector collector;
    @Resource
    public OpenQSTaskGroupDao openQSTaskGroupDao;
    @Resource
    public OpenQSTaskDao openQSTaskDao;
    @Resource
    public OpenQSAccountDao openQSAccountDao;
    @Resource
    public OpenQSThresholdConfigDao openQSThresholdConfigDao;
    @Resource
    public ChannelDao channelDao;


    @Override
    public void prepare(Map stormConf, TopologyContext context, OutputCollector collector) {
        ConfUtil.initSpringContext();
        ConfUtil.initLoggerConfig();

    }

    @Override
    public void execute(Tuple input) {
        Long time = input.getLongByField("time");

        try {
            FileUtils.forceDelete(new File("D:\\doc\\taskGroup.txt"));
            FileUtils.forceDelete(new File("D:\\doc\\account.txt"));
            FileUtils.forceDelete(new File("D:\\doc\\task.txt"));
            FileUtils.forceDelete(new File("D:\\doc\\thresholdConfig.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<TaskEmit> taskEmits = new ArrayList<>();

        ServiceManager serviceManager = new ServiceManager();
        serviceManager.start();

        TaskQueryParam param = new TaskQueryParam();
        TaskGroupType type = TaskGroupType.TASK_HTTP;
        param.setType(Sets.newHashSet(type));
        TaskManage.Iface iface = serviceManager.getSubscribeClient(
                "openQS",
                "TaskManage",
                1,
                TaskManage.Iface.class);

        List<OpenQSAccount> openQSAccounts = this.openQSAccountDao.selectAll();
        for (OpenQSAccount openQSAccount : openQSAccounts) {
            ApiResult apiResult = iface.queryTask(openQSAccount.getName(), openQSAccount.getPassword(), param);
            if (apiResult != null) {
                String result = apiResult.getResult();//result为json字符串
                List<TaskGroup> taskGroups = JSON.parseArray(result, TaskGroup.class);
                for (TaskGroup taskGroup : taskGroups) {
                    try {
                        OpenQSTaskGroup openQSTaskGroup = new OpenQSTaskGroup();
                        openQSTaskGroup.setTaskgroupId(taskGroup.getTaskgroupId());
                        openQSTaskGroup.setTaskgroupName(taskGroup.getTaskgroupName());
                        openQSTaskGroup.setTaskgroupType(taskGroup.getTaskgroupType());
                        openQSTaskGroup.setBeginDate((int) ((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(taskGroup.getBeginDate()).getTime()) / 1000));
                        openQSTaskGroup.setEndDate((int) ((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(taskGroup.getEndDate()).getTime()) / 1000));
                        openQSTaskGroup.setNodegroupId(taskGroup.getNodegroupId());
                        openQSTaskGroup.setNodegroupName(taskGroup.getNodegroupName());
                        openQSTaskGroup.setIntervalTime(taskGroup.getIntervalTime());
                        openQSTaskGroup.setStatus(taskGroup.getStatus());
                        openQSTaskGroup.setRemark(taskGroup.getRemark());
                        openQSTaskGroup.setWorkorder(taskGroup.getWorkorder());
                        openQSTaskGroup.setWorkorderType(taskGroup.getWorkorderType());
                        openQSTaskGroup.setWsms(taskGroup.getWsms());
                        openQSTaskGroup.setTimeOut(taskGroup.getTimeOut());
                        openQSTaskGroup.setHighTime(taskGroup.getHighTime());
                        openQSTaskGroup.setPing(taskGroup.getPing());
                        openQSTaskGroup.setNslookup(taskGroup.getNslookup());
                        openQSTaskGroup.setTraceroute(taskGroup.getTraceroute());
                        openQSTaskGroup.setFileSize(taskGroup.getFileSize());
                        openQSTaskGroup.setZip(taskGroup.getZip());
                        openQSTaskGroup.setHttpHead(taskGroup.getHttpHead());
                        openQSTaskGroup.setMonitorExclude(taskGroup.getMonitorExclude());
                        for (TimeEntity timeEntity : taskGroup.getTimeList()) {
                            openQSTaskGroup.setBeginTime((int) ((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(timeEntity.getBeginTime()).getTime()) / 1000));
                            openQSTaskGroup.setEndTime((int) ((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(timeEntity.getEndTime()).getTime()) / 1000));
                        }
                        openQSTaskGroup.setModifyStatus(taskGroup.getModifyStatus());
                        openQSTaskGroup.setCustName(taskGroup.getCustName());
                        openQSTaskGroup.setCustCnname(taskGroup.getCustCnname());
                        openQSTaskGroup.setCreateUser(taskGroup.getCreateUser());
                        openQSTaskGroup.setCreateTime((int) ((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(taskGroup.getCreateTime()).getTime()) / 1000));
                        openQSTaskGroup.setUpdateUser(taskGroup.getUpdateUser());
                        openQSTaskGroup.setUpdateTime((int) ((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(taskGroup.getUpdateTime()).getTime()) / 1000));
//                openQSTaskGroup.setLastsuccessTime((int) (System.currentTimeMillis() / 1000));

                        for (Task task : taskGroup.getTaskList()) {
                            OpenQSTask openQSTask = new OpenQSTask();
                            openQSTask.setId(task.getId());
                            openQSTask.setName(task.getName());
                            openQSTask.setHttp(Integer.parseInt(task.getHttp()));
                            openQSTask.setUrl(task.getUrl());
                            openQSTask.setStatus(Integer.parseInt(task.getStatus()));
                            openQSTask.setIp(task.getIp());
                            openQSTask.setTaskgroupId(taskGroup.getTaskgroupId());
                            String[] urls = task.getUrl().split("/");
                            String domain = urls[0];
                            String[] domains = domain.split(".");
                            String firstDomain = domains[0];
                            List<Channel> channels = this.channelDao.selectAll();
                            for (Channel channel : channels) {
                                if (channel.getName().equals(domain) && channel.getName().equals(firstDomain)) {
                                    openQSTask.setChannelId(channel.getId());
                                }
                            }
                            openQSTask.setCdnName(task.getCdnName());
                            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\doc\task.txt"));
                            bufferedWriter.write(openQSTask.toString());
                            bufferedWriter.flush();
                            bufferedWriter.close();

                            TaskEmit taskEmit = new TaskEmit();
                            taskEmit.setId(task.getId());
                            OpenQSTaskGroup openQSTaskGroup1 = this.openQSTaskGroupDao.selectByPrimaryKey(taskGroup.getTaskgroupId());
                            taskEmit.setLastsuccessTime(openQSTaskGroup1.getLastsuccessTime());
                            taskEmit.setUrl(task.getUrl());
                            taskEmits.add(taskEmit);
                        }
                        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\doc\taskGroup.txt"));
                        bufferedWriter.write(openQSTaskGroup.toString());
                        bufferedWriter.flush();
                        bufferedWriter.close();
                    } catch (ParseException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                MultipleDataSource.setDataSourceKey("Source_main");
                this.openQSTaskDao.loadData();
                this.openQSTaskGroupDao.loadData();

                MultipleDataSource.setDataSourceKey("Source_bak");
                this.openQSTaskDao.loadData();
                this.openQSTaskGroupDao.loadData();

                try {
                    FileUtils.forceDelete(new File("D:\\doc\\taskGroup.txt"));
                    FileUtils.forceDelete(new File("D:\\doc\\account.txt"));
                    FileUtils.forceDelete(new File("D:\\doc\\task.txt"));
                    FileUtils.forceDelete(new File("D:\\doc\\thresholdConfig.txt"));
                } catch (IOException e) {
                    e.printStackTrace();
                }

                List<OpenQSTask> openQSTasks = this.openQSTaskDao.selectAll();
                List<String> taskIdList = new ArrayList<>();
                for (OpenQSTask openQSTask : openQSTasks) {
                    taskIdList.add(openQSTask.getId());
                }
            }

        }
        for (TaskEmit taskEmit : taskEmits) {
            collector.emit(new Values(taskEmit));
        }
    }


    @Override
    public void declareOutputFields(OutputFieldsDeclarer declarer) {
        declarer.declare(new Fields("taskEmit"));
    }

    public static void main(String[] args) {

    }
}
