package com.cnc.qoss.openqs.common;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hongzhan on 2017/1/6.
 */
public class BeanUtil {
    public static Map<String, Object> transBean2Map(Object obj) {

        if(obj == null){
            return null;
        }
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor property : propertyDescriptors) {
                String key = property.getName();

                // 过滤class属性
                if (!key.equals("class") && !key.contains("Joda")) {
                    // 得到property对应的getter方法
                    Method getter = property.getReadMethod();
                    Object value = getter.invoke(obj);
                    key = key.replaceAll("([A-Z])", "_$1").toLowerCase();
                    map.put(key, value);
                }

            }
        } catch (Exception e) {
            System.out.println("transBean2Map Error " + e);
        }

        return map;

    }
//    public static Map<String, Object> transMapToUpperCaseKey(Map<String, Object> map) {
//
//        if(map == null){
//            return null;
//        }
//        Map<String, Object> result = new HashMap<String, Object>();
//        try {
//            for (String key:map.keySet()){
//                result.put(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL,key),map.get(key));
//            }
//        } catch (Exception e) {
//            System.out.println("transMapToUpperCaseKey Error " + e);
//        }
//
//        return result;
//
//    }
//
//    public static  void main(String[] args){
//        String Test = "log_time_date";
//
//        System.out.print(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL,Test));
//    }
}
