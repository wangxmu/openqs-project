package com.cnc.qoss.openqs.bolt;

import backtype.storm.task.OutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichBolt;
import backtype.storm.tuple.Tuple;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.cnc.dna.api.openQS.StatisticsReport.v1.QueryParam;
import com.cnc.dna.api.openQS.StatisticsReport.v1.StatisticsReport;
import com.cnc.dna.platform.core.ServiceManager;
import com.cnc.qoss.openqs.common.ConfUtil;
import com.cnc.qoss.openqs.dao.ChannelDao;
import com.cnc.qoss.openqs.dao.OpenQSTaskGroupDao;
import com.cnc.qoss.openqs.entity.esJsonObj.StatisticsReportResult;
import com.cnc.qoss.openqs.entity.esJsonObj.StatisticsReportResultValue;
import com.cnc.qoss.openqs.entity.esObj.EsSaveObj;
import com.cnc.qoss.openqs.entity.mysqlObj.Channel;
import com.cnc.qoss.openqs.entity.mysqlObj.TaskEmit;
import com.cnc.qoss.openqs.common.BeanUtil;
import org.apache.log4j.Logger;
import org.elasticsearch.action.bulk.BulkProcessor;
import org.elasticsearch.action.index.IndexRequest;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by wangyong8 on 2017/02/21.
 */
public class EsSaveDataBolt extends BaseRichBolt {

    private static Logger LOG = Logger.getLogger(EsSaveDataBolt.class);
    @Resource
    private ChannelDao channelDao;
    @Resource
    private OpenQSTaskGroupDao openQSTaskGroupDao;
    private BulkProcessor bulkProcessor;
    private String indexPrifex = "openqs_http_";
    private String TYPE = "openqs_http";

    @Override
    public void prepare(Map stormConf, TopologyContext context, OutputCollector collector) {
        ConfUtil.initSpringContext();
        ConfUtil.initLoggerConfig();
    }

    @Override
    public void execute(Tuple input) {
        TaskEmit taskEmit = (TaskEmit) input.getValue(0);
        ServiceManager serviceManager = new ServiceManager();
        serviceManager.start();
        StatisticsReport.Iface iface2 = serviceManager.getSubscribeClient(
                "openQS",
                "StatisticsReport",
                1,
                StatisticsReport.Iface.class);
        QueryParam statisParam = new QueryParam();
        statisParam.setTaskIds(taskEmit.getId());
        statisParam.setType("scatter");
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:00:00");
            Date date = sdf.parse(sdf.format(new Date()));//时间戳规整到0分0秒
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.HOUR_OF_DAY, -2);
            statisParam.setDateBegin(sdf.format(calendar.getTime()));
            calendar.add(Calendar.HOUR_OF_DAY, +1);
            statisParam.setDateEnd(sdf.format(calendar.getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        statisParam.setQuota("1");
        com.cnc.dna.api.openQS.StatisticsReport.v1.ApiResult openQS = iface2.query("openQS", statisParam);
        if (openQS != null) {
            String result = openQS.getResult();
            StatisticsReportResult statisticsReportResult = (StatisticsReportResult) JSON.parse(result);
            List<StatisticsReportResultValue> statisticsReportResultValues = statisticsReportResult.getStatisticsReportResultValues();
            for (StatisticsReportResultValue statisticsReportResultValue : statisticsReportResultValues) {
                EsSaveObj esSaveObj = new EsSaveObj();
                esSaveObj.setTaskId(statisticsReportResult.getTaskId());
                esSaveObj.setDectId(statisticsReportResultValue.getDectId());
                esSaveObj.setValue(Double.parseDouble(statisticsReportResultValue.getValue()));
                esSaveObj.setMonitorIp(statisticsReportResultValue.getMonitorIp());
                esSaveObj.setDetectTime(Long.parseLong(statisticsReportResultValue.getDetectTime()));
                esSaveObj.setCityCode(statisticsReportResultValue.getCityCode());
                esSaveObj.setCityCodecn(statisticsReportResultValue.getProvinceCodecn());
                esSaveObj.setProvinceCode(statisticsReportResultValue.getProvinceCode());
                esSaveObj.setProvinceCodecn(statisticsReportResultValue.getProvinceCodecn());
                esSaveObj.setDestIp(statisticsReportResultValue.getDestIp());
                esSaveObj.setDestCityCode(statisticsReportResultValue.getDestCityCode());
                esSaveObj.setDestProvinceCode(statisticsReportResultValue.getDestProvinceCode());
                esSaveObj.setDnsTime(Double.parseDouble(statisticsReportResultValue.getDnsTime()));
                esSaveObj.setRedirectTime(Double.parseDouble(statisticsReportResultValue.getRedirectTime()));
                esSaveObj.setConnectTime(Double.parseDouble(statisticsReportResultValue.getConnectTime()));
                esSaveObj.setResponseTime(Double.parseDouble(statisticsReportResultValue.getResponseTime()));
                esSaveObj.setDownTime(Double.parseDouble(statisticsReportResultValue.getDownTime()));
                esSaveObj.setAllTime(Double.parseDouble(statisticsReportResultValue.getAllTime()));
                esSaveObj.setFileSize(Double.parseDouble(statisticsReportResultValue.getFileSize()));
                esSaveObj.setStatus(Integer.parseInt(statisticsReportResultValue.getStatus()));
                esSaveObj.setCarryCompany(Integer.parseInt(statisticsReportResultValue.getCarryCompany()));
                esSaveObj.setCarryCompanycn(statisticsReportResultValue.getCarryCompanycn());
                esSaveObj.setDnsIp(statisticsReportResultValue.getDnsIp());
                List<Channel> channels = this.channelDao.selectAll();
                String url = taskEmit.getUrl();
                String[] urls = url.split("/");
                String url1 = urls[0];
                String[] urls1 = urls[0].split("\\.");
                String url2 = urls1[0];
                for (Channel channel : channels) {
                    if (url1.equals(channel.getName())) {
                        esSaveObj.setChannelId(channel.getId());
                        esSaveObj.setAppGroupId(channel.getAppGroupId());
                        esSaveObj.setProductLine(channel.getProductLine());
                    } else if (url2.equals(channel.getName())) {
                        esSaveObj.setChannelId(channel.getId());
                        esSaveObj.setAppGroupId(channel.getAppGroupId());
                        esSaveObj.setProductLine(channel.getProductLine());
                    }
                }

                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
                String now = sdf.format(new Date());
                String index = indexPrifex + now;
                String line = JSON.toJSONString(BeanUtil.transBean2Map(esSaveObj), SerializerFeature.WriteMapNullValue);
                bulkProcessor.add(new IndexRequest(index).source(line));
            }
        }
        bulkProcessor.flush();
//        this.openQSTaskGroupDao.updateLastSuccessTime();
    }


    @Override
    public void declareOutputFields(OutputFieldsDeclarer declarer) {
      /*  declarer.declare( new Fields("time"));*/
    }

    public static void main(String[] args) {


    }
}
