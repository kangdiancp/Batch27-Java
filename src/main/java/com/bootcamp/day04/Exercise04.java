package com.bootcamp.day04;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exercise04 {
    public static void main(String[] args) {
        zonedDateTime();
    }

    public static void zonedDateTime() {
        // determine current time as ZonedDateTime object
        final ZonedDateTime startBootcamp = ZonedDateTime.of(LocalDate.parse("2023-10-30"),
                LocalTime.parse("10:27:15"),
                ZoneId.of("Asia/Jakarta"));
        System.out.println("start bootcamp : "+startBootcamp);
    }

    public static void howManyHourFromPapuaToJakarta(){
        
    }
}
