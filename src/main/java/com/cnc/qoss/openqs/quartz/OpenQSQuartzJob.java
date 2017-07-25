package com.cnc.qoss.openqs.quartz;

import backtype.storm.spout.SpoutOutputCollector;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import backtype.storm.tuple.Values;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by wangyong8 on 2017/02/21.
 */
public class OpenQSQuartzJob implements Job {

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        JobDataMap map = context.getJobDetail().getJobDataMap();
        SpoutOutputCollector collector = (SpoutOutputCollector) map.get("collector");

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:00:00");
            long aligned = sdf.parse(sdf.format(new Date())).getTime();//时间戳规整到0分0秒
            collector.emit(new Values(aligned));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
