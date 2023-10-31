package com.bootcamp.day04;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Exercise07 {
    public static void main(String[] args) {
        durationExample();
    }

    public static void durationExample() {
        final LocalDate now = LocalDate.now();
        final LocalDate startBootcamp = LocalDate.of(2023, Month.OCTOBER, 12);

        System.out.println("Using Until()");
        System.out.println("now -> startbootcamp : " + now.until(startBootcamp));//P-19D
        System.out.println("startbootcamp -> now : " + startBootcamp.until(now));//P19D

        System.out.println("Using Period()");
        System.out.println("now -> startbootcamp : " + Period.between(now,startBootcamp));//P-19D
        System.out.println("startbootcamp -> now : " + Period.between(now,startBootcamp));////P19D
        System.out.println("Periode extract day : " + Period.between(now,startBootcamp).getDays());//-19

    }

}
