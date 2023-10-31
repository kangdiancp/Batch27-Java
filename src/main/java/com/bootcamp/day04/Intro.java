package com.bootcamp.day04;



import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;


public class Intro {
    public static void main(String[] args) {
        legacyDate();
        //monthDayOfWeek();
    }

    public static void monthDayOfWeek(){
        final DayOfWeek sunday = DayOfWeek.SUNDAY;
        final Month february = Month.FEBRUARY;

        final DayOfWeek friday = sunday.plus(5);
        final Month march = february.plus(13);

        System.out.println(sunday); // SUNDAY
        System.out.println(february); // FEBRUARY
        System.out.println(friday); // FRIDAY
        System.out.println(march); //MARCH
    }

    public static void legacyDate(){
        final Date now = new Date();
        final Instant nowAsInstant = now.toInstant ();
        final Date nowFromAsInstant = Date.from(nowAsInstant);

        final ZoneId systemZone = ZoneId.systemDefault();
        final LocalDateTime localDateTime = LocalDateTime.ofInstant(nowAsInstant,
                                                                    systemZone);
        final ZoneId zoneJakarta = ZoneId.of("Asia/Jakarta");
        final ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(nowAsInstant,
                                                                    zoneJakarta);

        System.out.println("LocalDateTime: " + localDateTime);//2023-10-30T06:14:27.14:27.753 
        System.out.println("ZonedDateTime: " + zonedDateTime);//2023-10-30T06:14:27.753+07:00[Asia/Jakarta]                                                                    

    }
}
