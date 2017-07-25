package com.cnc.qoss.openqs.common;

import com.cnc.qoss.jstorm.utils.SpringContextUtil;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.extras.DOMConfigurator;
import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.xml.Log4jEntityResolver;
import org.apache.log4j.xml.SAXErrorHandler;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

/**
 * 配置读取
 * @author chensl
 *
 */
public final class ConfUtil {
	final private static Logger LOG = Logger.getLogger(ConfUtil.class);
	private static PropertiesConfiguration pc;
	
	static{
		try {
			pc = new PropertiesConfiguration("wsbas-util.properties");
	        Iterator<String> itor = pc.getKeys();
	        while(itor.hasNext()){
	        	String key = itor.next();
	        	LOG.info("key:" + key + ",prop:" + pc.getProperty(key));
	        }
		} catch (Throwable e) {
            LOG.error("Failed to load config", e);
        }
	}

	public static void initLoggerConfig(){
		String module = pc.getString("logger.config.module");
		String config ="log4j_common.xml";
		//如果默认位置没有读取到配置,就从公共文件中读取一个单独的配置文件名，并从其中读取配置
		String path = ConfUtil.class.getResource("/").getPath() + config;
		File xmlFile = new File(path);
		String strFile = "";
		try {
			strFile = FileUtils.readFileToString(xmlFile);
			strFile = strFile.replaceAll("#\\{module.name\\}", module);
		} catch (IOException e1) {
			LogLog.debug("Could not instantiate a DocumentBuilderFactory.", e1);
		}
		load2LogConfig(strFile);
	}

	private static void load2LogConfig(String strFile) {
		InputStream inFile = new ByteArrayInputStream(strFile.getBytes());
		DocumentBuilderFactory dbf = null;
		try {
			dbf = DocumentBuilderFactory.newInstance();
		} catch(FactoryConfigurationError fce) {
			Exception e = fce.getException();
			LogLog.debug("Could not instantiate a DocumentBuilderFactory.", e);
			throw fce;
		}
		try {
			dbf.setValidating(true);
			DocumentBuilder docBuilder = dbf.newDocumentBuilder();
			docBuilder.setErrorHandler(new SAXErrorHandler());
			docBuilder.setEntityResolver(new Log4jEntityResolver());
			Document doc = docBuilder.parse(inFile);
			Element element =  doc.getDocumentElement();
			DOMConfigurator.configure(element);
		} catch (Exception e) {
		}
	}


	public static void initSpringContext(){
		if(SpringContextUtil.getApplicationContext() == null){
			String systemType = pc.getString("system.type");
			LOG.info("systemType:" + systemType);
			if(systemType != null){
				new ClassPathXmlApplicationContext("application_" + systemType + ".xml");
			}else{
				new ClassPathXmlApplicationContext("classpath*:applicationContext.xml", "applicationContext-*.xml");
			}
			if(SpringContextUtil.getApplicationContext()!= null){
				LOG.info("SpringContext init succeeded!");
			}else{
				LOG.info("SpringContext init failed!");
			}
		} 
	}

	public static int getInt(String key, int defaultValue) {
		return pc.getInt(key, defaultValue);
	}

	public static String[] getArray(String key) {
		return pc.getStringArray(key);
	}

	public static String getString(String key) {
		return pc.getString(key);
	}

}
