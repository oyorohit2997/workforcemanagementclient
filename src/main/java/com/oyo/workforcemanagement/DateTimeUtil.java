package com.oyo.workforcemanagement;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateTimeUtil {

    public static LocalDate getUTCDate(long epochSeconds) {
        return Instant.ofEpochSecond(epochSeconds).atZone(ZoneId.of("UTC")).toLocalDate();
    }

    public static long getEpochDay(long epochSeconds) {
        return getUTCDate(epochSeconds).toEpochDay();
    }

    public static long getEpochSecondsOfEpochDate(long epochSeconds){
        return getEpochDay(epochSeconds)*24*60*60;
    }

    public static long getCurrentEpoch() throws ParseException {
        Date date = new Date();
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date today = new Date();
        Date todayWithZeroTime = formatter.parse(formatter.format(today));
        System.out.println(todayWithZeroTime);
        return todayWithZeroTime.toInstant().toEpochMilli()/1000;
    }
    public static Date getNextDate(Date currDate) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date todayWithZeroTime = null;
        try {
            todayWithZeroTime = formatter.parse(formatter.format(currDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currDate);
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        return formatter.parse(formatter.format(calendar.getTime()));
    }

}
