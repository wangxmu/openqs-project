package com.cnc.qoss.openqs.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by wangyong8 on 2017/02/21.
 */
public class DateUtil {

    public static String timestamp2Dateformat(Long timestamp,String patten) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(patten);

        return sdf.format(new Date(timestamp*1000));
    }

    public static void main(String[] args) throws ParseException {
        System.out.println(timestamp2Dateformat(1477637762l,"yyyy-MM-dd HH:mm"));
    }
}
