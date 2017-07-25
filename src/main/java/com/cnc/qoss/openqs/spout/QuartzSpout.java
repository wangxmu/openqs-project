package com.cnc.qoss.openqs.spout;

import backtype.storm.spout.SpoutOutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichSpout;
import backtype.storm.tuple.Fields;
import backtype.storm.utils.Utils;
import com.cnc.qoss.openqs.common.ConfUtil;
import com.cnc.qoss.openqs.quartz.OpenQSQuartzJob;
import org.apache.log4j.Logger;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Map;

import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

/**
 * Created by wangyong8 on 2017/02/21.
 */
public class QuartzSpout extends BaseRichSpout {

    private static final long serialVersionUID = 1L;
    private SpoutOutputCollector collector;
    final private static Logger LOG = Logger.getLogger(QuartzSpout.class);
    private Scheduler sched;
    private String cron ;

    public QuartzSpout cron(String cron){
        this.cron=cron;
        return this;
    }

    @Override
    public void nextTuple() {
        try{
            if(!sched.isStarted()){
                JobDataMap map = new JobDataMap();
                map.put("collector", collector);
                JobDetail job =newJob(OpenQSQuartzJob.class).setJobData(map).build();
                LOG.info("className: " + this.getClass() + ", cron: " + cron+", id of job: "+job.getKey());

                Trigger trigger = newTrigger().startNow().withSchedule(cronSchedule(cron)).build();
                sched.scheduleJob(job, trigger);
                sched.start();
            }
            LOG.info("sched isStarted:" + sched.isStarted() + "," + sched.getCurrentlyExecutingJobs());
            Utils.sleep(100000);
        }catch(Exception e){
            LOG.error(e);
        }
    }
    @Override
    public void open(Map config, TopologyContext context, SpoutOutputCollector collector) {
        ConfUtil.initLoggerConfig();
        SchedulerFactory schedFact = new StdSchedulerFactory();
        try {
            sched = schedFact.getScheduler();
        } catch (SchedulerException e) {
            LOG.error("Init quartz failed.",e);
        }

        this.collector = collector;
    }

    @Override
    public void declareOutputFields(OutputFieldsDeclarer declarer) {
        declarer.declare( new Fields("time"));
    }
}
