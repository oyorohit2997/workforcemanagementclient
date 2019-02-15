package com.oyo.workforcemanagement;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

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
        return ZonedDateTime.now(ZoneId.of("UTC")).toLocalDate().toEpochDay()*24*3600;
    }

}
