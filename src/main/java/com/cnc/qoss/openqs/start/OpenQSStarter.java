package com.cnc.qoss.openqs.start;

import backtype.storm.Config;
import backtype.storm.LocalCluster;
import backtype.storm.StormSubmitter;
import backtype.storm.topology.TopologyBuilder;
import com.alibaba.jstorm.client.ConfigExtension;
import com.cnc.qoss.openqs.bolt.EsSaveDataBolt;
import com.cnc.qoss.openqs.bolt.TaskBolt;
import com.cnc.qoss.openqs.common.ConfUtil;
import com.cnc.qoss.openqs.common.Const;
import com.cnc.qoss.openqs.spout.QuartzSpout;
import org.apache.log4j.Logger;

/**
 * Created by wangyong8 on 2017/02/21.
 */
public class OpenQSStarter {

    final private static Logger LOG = Logger.getLogger(OpenQSStarter.class);

    public static void main(String[] args) {

        //构建拓扑
        TopologyBuilder builder = new TopologyBuilder();
        QuartzSpout spout = new QuartzSpout().cron("0 * * * * ?");
        builder.setSpout(Const.TOPO_OPENQS_SPOUT_NAME, spout,1);
        builder.setBolt(Const.TOPO_OPENQS_TASK_BOLT_NAME,  new TaskBolt(),1).shuffleGrouping(Const.TOPO_OPENQS_SPOUT_NAME);
        builder.setBolt(Const.TOPO_OPENQS_ES_BOLT_NAME,  new EsSaveDataBolt(),2).shuffleGrouping(Const.TOPO_OPENQS_TASK_BOLT_NAME);


        //设置运行参数
        Config config = new Config();
        config.setNumWorkers(ConfUtil.getInt("jstorm.workers", 1));
        config.setNumAckers(ConfUtil.getInt("num.ackers",0));
        ConfigExtension.setSpoutSingleThread(config, true);
        ConfigExtension.setMemSizePerWorkerByGB(config, ConfUtil.getInt("worker.memsize",2));

        //启动
        try {
            if (args.length == 0) {//无参本地调试
                LocalCluster cluster = new LocalCluster();
                cluster.submitTopology(Const.TOPO_NAME, config, builder.createTopology());
            } else {//带任意参提交到集群
                StormSubmitter.submitTopology(Const.TOPO_NAME, config, builder.createTopology());
            }
        }catch (Exception e){
            LOG.error("Failed to submit job.",e);
        }
    }
}
