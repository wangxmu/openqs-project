package com.cnc.qoss.openqs.entity.esJsonObj;

import java.util.List;

/**
 * Created by wangyong on 2017/3/6.
 */
public class StatisticsReportResult {
    private String taskId;
    private List<StatisticsReportResultValue> statisticsReportResultValues;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public List<StatisticsReportResultValue> getStatisticsReportResultValues() {
        return statisticsReportResultValues;
    }

    public void setStatisticsReportResultValues(List<StatisticsReportResultValue> statisticsReportResultValues) {
        this.statisticsReportResultValues = statisticsReportResultValues;
    }
}
