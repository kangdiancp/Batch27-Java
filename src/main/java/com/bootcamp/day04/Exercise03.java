package com.bootcamp.day04;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;


public class Exercise03 {
    public static void main(String[] args) {
        temporalAdjusters();
    }

    public static void temporalAdjusters(){
        final LocalDate startBootcamp = LocalDate.of(2023, Month.OCTOBER, 12);
        
        // java 11 or latest, bisa gunakan keyword var untuk deklarasi variable
        var firstDay = startBootcamp.with(TemporalAdjusters.firstDayOfMonth());
        var lastDay = startBootcamp.with(TemporalAdjusters.lastDayOfMonth());
        var prevMonday = startBootcamp.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));


        System.out.println("startBoocamp : "+ startBootcamp);
        System.out.println("firstDay : "+ firstDay);
        System.out.println("lastDay : "+ lastDay);
        System.out.println("prevMonday : "+ prevMonday);
    }
}
