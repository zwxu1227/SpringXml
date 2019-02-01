package com.zwxu.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimeHelper {
    public static String addTime(String time, String format, TimeType timeType, int length) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date date = sdf.parse(time);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(timeType.getState(), length);
        date = calendar.getTime();
        String rs = sdf.format(date);
        return rs;
    }

    public static Date dateBackOrBeforeMove(Date date, TimeType timeType, int length) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(timeType.getState(), length);
        date = calendar.getTime();
        return date;
    }
}

