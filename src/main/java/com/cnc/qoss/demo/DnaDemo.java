package com.cnc.qoss.demo;

import com.cnc.dna.api.openQS.StatisticsReport.v1.QueryParam;
import com.cnc.dna.api.openQS.StatisticsReport.v1.StatisticsReport;
import com.cnc.dna.api.openQS.TaskManage.v1.ApiResult;
import com.cnc.dna.api.openQS.TaskManage.v1.TaskGroupType;
import com.cnc.dna.api.openQS.TaskManage.v1.TaskManage;
import com.cnc.dna.api.openQS.TaskManage.v1.TaskQueryParam;
import com.cnc.dna.platform.core.ServiceManager;
import com.google.common.collect.Sets;

/**
 * Created by hongzhan on 2017/2/20.
 */
public class DnaDemo {
    public static void main(String[] args) {
        ServiceManager serviceManager = new ServiceManager();
        serviceManager.start();

        TaskQueryParam param=new TaskQueryParam();
        TaskGroupType type=TaskGroupType.TASK_HTTP;
        param.setType(Sets.newHashSet(type));
        TaskManage.Iface iface=serviceManager.getSubscribeClient(
                "openQS",
                "TaskManage",
                1,
                TaskManage.Iface.class);

        ApiResult yangss = iface.queryTask("yangss", "Yss@0928", param);
        //System.out.println(yangss.toString());

        StatisticsReport.Iface iface2=serviceManager.getSubscribeClient(
                "openQS",
                "StatisticsReport",
                1,
                StatisticsReport.Iface.class);
        QueryParam statisParam=new QueryParam();
        statisParam.setTaskIds("933f08cc1a7f452db46c7f2660db67a2");
        statisParam.setType("scatter");
        statisParam.setDateBegin("2017-02-12 00:00:00");
        statisParam.setDateEnd("2017-02-13 00:00:00");

        statisParam.setQuota("1");
        com.cnc.dna.api.openQS.StatisticsReport.v1.ApiResult openQS = iface2.query("openQS", statisParam);
        System.out.println(openQS.getResult());
        System.out.println(openQS.toString());
    }
}
