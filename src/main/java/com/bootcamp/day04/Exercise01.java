package com.bootcamp.day04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class Exercise01 {
    public static void main(String[] args) {
        LocalDateExample();
        //LocalDateTimeExample();
    }

    public static void LocalDateExample(){
        //rini birthday 12 feb 2002
        final LocalDate riniBirthDay = LocalDate.of(2000, Month.FEBRUARY, 12);

        final LocalDate now = LocalDate.now();
        
        // widi lahir beda 1 tahun dari rini
        final LocalDate widiBirthDay = riniBirthDay.plusDays(18).
                        plusMonths(3).
                        plusYears(1);

        //rini lahir di tahun kabisat, kita pastikan informasi lastdaymoth di tahun kabisat
        final LocalDate lastDayInFebruary = riniBirthDay.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println("riniBirthDay:    " + riniBirthDay);//2000-02-12
        System.out.println("widiBirthDay:  " + widiBirthDay);//2001-06-01
        System.out.println("lastDayInFebruary: " + lastDayInFebruary);//2000-02-29

      
    }

    public static void LocalDateTimeExample(){
    
        final LocalTime atTen = LocalTime.of(10,00,00);
        final LocalTime tenFifteen = atTen.plusMinutes(15);
        //hours to subtract
        final LocalTime breakfastTime = tenFifteen.minusHours(2);

        System.out.println("\natTen:             " + atTen);//10:00
        System.out.println("tenFifteen:        " + tenFifteen);//10:15
        System.out.println("breakfastTime:     " + breakfastTime);// 08:15

        final LocalDateTime jdk8Release = LocalDateTime.of(2014, 3, 18, 8, 30);
        System.out.println("\njdk8Release:  " + jdk8Release);//2014-03-18T08:30
        System.out.printf("jdk8Release:  %s.%s.%s\n", jdk8Release.getDayOfMonth(),
                          jdk8Release.getMonthValue(),
                          jdk8Release.getYear()); //18.3.2014
    }
}
