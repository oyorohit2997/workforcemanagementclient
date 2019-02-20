package com.oyo.workforcemanagement;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
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

    public static long getCurrentEpoch(){
        Date date = new Date();
        return date.toInstant().toEpochMilli()/1000;
    }

}
