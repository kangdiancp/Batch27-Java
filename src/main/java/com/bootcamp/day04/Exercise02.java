package com.bootcamp.day04;

import java.time.LocalDate;
import java.time.Month;
import java.util.stream.Stream;

public class Exercise02 {
    public static void main(String[] args) {
        localDateStreamExample();
    }

    public static void localDateStreamExample(){
        final LocalDate startBootcamp = LocalDate.of(2023, Month.OCTOBER, 12);
        final LocalDate endBootcamp = LocalDate.of(2023, Month.DECEMBER, 12);
        
        final Stream<LocalDate> daysUntil = startBootcamp.datesUntil(endBootcamp);
        //menampilkan list hari dimulai dari tanggal 22-10-2023 (skip 10 hari) &
        // menampilkan list hari secara terurut.
        daysUntil.skip(10).limit(10).forEach(System.out::println);

    }
}
