package com.cnc.qoss.openqs.entity.mysqlObj;

/**
 * Created by wangyong on 2017/2/22.
 */
public class OpenQSTaskGroup {
    private String taskgroupId;

    private String taskgroupName;

    private Integer taskgroupType;

    private Integer beginDate;

    private Integer endDate;

    private String nodegroupId;

    private String nodegroupName;

    private Integer intervalTime;

    private Integer status;

    private String remark;

    private Integer workorder;

    private Integer workorderType;

    private Integer wsms;

    private Integer timeOut;

    private Integer highTime;

    private Integer ping;

    private Integer nslookup;

    private Integer traceroute;

    private Integer fileSize;

    private Integer zip;

    private String httpHead;

    private String monitorExclude;

    private Integer beginTime;

    private Integer endTime;

    private Integer modifyStatus;

    private String custName;

    private String custCnname;

    private String createUser;

    private Integer createTime;

    private String updateUser;

    private Integer updateTime;

    private Integer lastsuccessTime;

    public String getTaskgroupId() {
        return taskgroupId;
    }

    public void setTaskgroupId(String taskgroupId) {
        this.taskgroupId = taskgroupId == null ? null : taskgroupId.trim();
    }

    public String getTaskgroupName() {
        return taskgroupName;
    }

    public void setTaskgroupName(String taskgroupName) {
        this.taskgroupName = taskgroupName == null ? null : taskgroupName.trim();
    }

    public Integer getTaskgroupType() {
        return taskgroupType;
    }

    public void setTaskgroupType(Integer taskgroupType) {
        this.taskgroupType = taskgroupType;
    }

    public Integer getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Integer beginDate) {
        this.beginDate = beginDate;
    }

    public Integer getEndDate() {
        return endDate;
    }

    public void setEndDate(Integer endDate) {
        this.endDate = endDate;
    }

    public String getNodegroupId() {
        return nodegroupId;
    }

    public void setNodegroupId(String nodegroupId) {
        this.nodegroupId = nodegroupId == null ? null : nodegroupId.trim();
    }

    public String getNodegroupName() {
        return nodegroupName;
    }

    public void setNodegroupName(String nodegroupName) {
        this.nodegroupName = nodegroupName == null ? null : nodegroupName.trim();
    }

    public Integer getIntervalTime() {
        return intervalTime;
    }

    public void setIntervalTime(Integer intervalTime) {
        this.intervalTime = intervalTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getWorkorder() {
        return workorder;
    }

    public void setWorkorder(Integer workorder) {
        this.workorder = workorder;
    }

    public Integer getWorkorderType() {
        return workorderType;
    }

    public void setWorkorderType(Integer workorderType) {
        this.workorderType = workorderType;
    }

    public Integer getWsms() {
        return wsms;
    }

    public void setWsms(Integer wsms) {
        this.wsms = wsms;
    }

    public Integer getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Integer timeOut) {
        this.timeOut = timeOut;
    }

    public Integer getHighTime() {
        return highTime;
    }

    public void setHighTime(Integer highTime) {
        this.highTime = highTime;
    }

    public Integer getPing() {
        return ping;
    }

    public void setPing(Integer ping) {
        this.ping = ping;
    }

    public Integer getNslookup() {
        return nslookup;
    }

    public void setNslookup(Integer nslookup) {
        this.nslookup = nslookup;
    }

    public Integer getTraceroute() {
        return traceroute;
    }

    public void setTraceroute(Integer traceroute) {
        this.traceroute = traceroute;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public String getHttpHead() {
        return httpHead;
    }

    public void setHttpHead(String httpHead) {
        this.httpHead = httpHead == null ? null : httpHead.trim();
    }

    public String getMonitorExclude() {
        return monitorExclude;
    }

    public void setMonitorExclude(String monitorExclude) {
        this.monitorExclude = monitorExclude == null ? null : monitorExclude.trim();
    }

    public Integer getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public Integer getModifyStatus() {
        return modifyStatus;
    }

    public void setModifyStatus(Integer modifyStatus) {
        this.modifyStatus = modifyStatus;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getCustCnname() {
        return custCnname;
    }

    public void setCustCnname(String custCnname) {
        this.custCnname = custCnname == null ? null : custCnname.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getLastsuccessTime() {
        return lastsuccessTime;
    }

    public void setLastsuccessTime(Integer lastsuccessTime) {
        this.lastsuccessTime = lastsuccessTime;
    }

    @Override
    public String toString() {
        return "\"" + "0" + "\"" + "," + "\"" + this.getTaskgroupId() + "\"" + "," + "\"" + this.getTaskgroupName().toString() + "\"" + "," + "\"" + this.getTaskgroupType().toString() + "\"" + "," + "\"" + this.getBeginDate().toString() + "\"" + "," + "\"" + this.getEndDate().toString() + "\"" + "," + "\"" + this.getNodegroupId() + "\"" + "," + "\"" + this.getNodegroupName() + "\"" + "," + "\"" + this.getIntervalTime().toString() + "\"" + "," + "\"" + this.getStatus().toString() + "\"" + "," + "\"" + this.getRemark() + "\"" + "," + "\"" + this.getWorkorder().toString() + "\"" + "," + "\"" + this.getWorkorderType().toString() + "\"" + "," + "\"" + this.getWsms().toString() + "\"" + "," + "\"" + this.getTimeOut().toString() + "\"" + "," + "\"" + this.getHighTime().toString() + "\"" + "," + "\"" + this.getPing().toString() + "\"" + "," + "\"" + this.getNslookup().toString() + "\"" + "," + "\"" + this.getTraceroute().toString() + "\"" + "," + "\"" + this.getFileSize().toString() + "\"" + "," + "\"" + this.getZip().toString() + "\"" + "," + "\"" + this.getHttpHead() + "\"" + "," + "\"" + this.getMonitorExclude() + "\"" + "," + "\"" + this.getBeginTime().toString() + "\"" + "," + "\"" + this.getEndTime().toString() + "\"" + "," + "\"" + this.getModifyStatus().toString() + "\"" + "," + "\"" + this.getCustName() + "\"" + "," + "\"" + this.getCustCnname() + "\"" + "," + "\"" + this.getCreateUser() + "\"" + "," + "\"" + this.getCreateTime().toString() + "\""+ "," + "\"" + this.getUpdateUser() + "\""+ "," + "\"" + this.getUpdateTime().toString() + "\""+ "," + "\"" + this.getLastsuccessTime().toString() + "\""+ "\n";
    }
}