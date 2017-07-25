package com.cnc.qoss.openqs.entity.jsonObj;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangyong on 2017/2/28.
 */
public class TaskGroup {
    private String beginDate;
    private String createTime;
    private String createUser;
    private String custCnname;
    private String custName;
    private String endDate;
    private int fileSize;
    private int highTime;
    private String httpHead;
    private int intervalTime;
    private int modifyStatus;
    private String monitorExclude;
    private String nodegroupId;
    private String nodegroupName;
    private int nslookup;
    private int ping;
    private String remark;
    private int status;
    private List<Task> taskList = new ArrayList<>();
    private String taskgroupId;
    private String taskgroupName;
    private int taskgroupType;
    private List<TimeEntity> timeList = new ArrayList<>();
    private int timeOut;
    private int traceroute;
    private String type;
    private String updateTime;
    private String updateUser;
    private int workorder;
    private int workorderType;
    private int wsms;
    private int zip;

    public TaskGroup(String beginDate, String createTime, String createUser, String custCnname, String custName, String endDate, int fileSize, int highTime, String httpHead, int intervalTime, int modifyStatus, String monitorExclude, String nodegroupId, String nodegroupName, int nslookup, int ping, String remark, int status, List<Task> taskList, String taskgroupId, String taskgroupName, int taskgroupType, List<TimeEntity> timeList, int timeOut, int traceroute, String type, String updateTime, String updateUser, int workorder, int workorderType, int wsms, int zip) {
        this.beginDate = beginDate;
        this.createTime = createTime;
        this.createUser = createUser;
        this.custCnname = custCnname;
        this.custName = custName;
        this.endDate = endDate;
        this.fileSize = fileSize;
        this.highTime = highTime;
        this.httpHead = httpHead;
        this.intervalTime = intervalTime;
        this.modifyStatus = modifyStatus;
        this.monitorExclude = monitorExclude;
        this.nodegroupId = nodegroupId;
        this.nodegroupName = nodegroupName;
        this.nslookup = nslookup;
        this.ping = ping;
        this.remark = remark;
        this.status = status;
        this.taskList = taskList;
        this.taskgroupId = taskgroupId;
        this.taskgroupName = taskgroupName;
        this.taskgroupType = taskgroupType;
        this.timeList = timeList;
        this.timeOut = timeOut;
        this.traceroute = traceroute;
        this.type = type;
        this.updateTime = updateTime;
        this.updateUser = updateUser;
        this.workorder = workorder;
        this.workorderType = workorderType;
        this.wsms = wsms;
        this.zip = zip;
    }

    public TaskGroup() {
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getCustCnname() {
        return custCnname;
    }

    public void setCustCnname(String custCnname) {
        this.custCnname = custCnname;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public int getHighTime() {
        return highTime;
    }

    public void setHighTime(int highTime) {
        this.highTime = highTime;
    }

    public String getHttpHead() {
        return httpHead;
    }

    public void setHttpHead(String httpHead) {
        this.httpHead = httpHead;
    }

    public int getIntervalTime() {
        return intervalTime;
    }

    public void setIntervalTime(int intervalTime) {
        this.intervalTime = intervalTime;
    }

    public int getModifyStatus() {
        return modifyStatus;
    }

    public void setModifyStatus(int modifyStatus) {
        this.modifyStatus = modifyStatus;
    }

    public String getMonitorExclude() {
        return monitorExclude;
    }

    public void setMonitorExclude(String monitorExclude) {
        this.monitorExclude = monitorExclude;
    }

    public String getNodegroupId() {
        return nodegroupId;
    }

    public void setNodegroupId(String nodegroupId) {
        this.nodegroupId = nodegroupId;
    }

    public String getNodegroupName() {
        return nodegroupName;
    }

    public void setNodegroupName(String nodegroupName) {
        this.nodegroupName = nodegroupName;
    }

    public int getNslookup() {
        return nslookup;
    }

    public void setNslookup(int nslookup) {
        this.nslookup = nslookup;
    }

    public int getPing() {
        return ping;
    }

    public void setPing(int ping) {
        this.ping = ping;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    public String getTaskgroupId() {
        return taskgroupId;
    }

    public void setTaskgroupId(String taskgroupId) {
        this.taskgroupId = taskgroupId;
    }

    public String getTaskgroupName() {
        return taskgroupName;
    }

    public void setTaskgroupName(String taskgroupName) {
        this.taskgroupName = taskgroupName;
    }

    public int getTaskgroupType() {
        return taskgroupType;
    }

    public void setTaskgroupType(int taskgroupType) {
        this.taskgroupType = taskgroupType;
    }

    public List<TimeEntity> getTimeList() {
        return timeList;
    }

    public void setTimeList(List<TimeEntity> timeList) {
        this.timeList = timeList;
    }

    public int getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }

    public int getTraceroute() {
        return traceroute;
    }

    public void setTraceroute(int traceroute) {
        this.traceroute = traceroute;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public int getWorkorder() {
        return workorder;
    }

    public void setWorkorder(int workorder) {
        this.workorder = workorder;
    }

    public int getWorkorderType() {
        return workorderType;
    }

    public void setWorkorderType(int workorderType) {
        this.workorderType = workorderType;
    }

    public int getWsms() {
        return wsms;
    }

    public void setWsms(int wsms) {
        this.wsms = wsms;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
}
