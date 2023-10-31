package com.bootcamp.day04;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import static java.time.format.FormatStyle.SHORT;

import static java.time.format.DateTimeFormatter.ofPattern;

import java.time.LocalDate;
import java.time.Month;

public class Exercise05 {
    public static void main(String[] args) {
        // dateFormatterSample();
        parseDateSample();
    }

    public static void parseDateSample() {
        final DateTimeFormatter simpleFormat = ofPattern("dd/MM/yyyy");
        final LocalDate startBootcamp = LocalDate.parse("2023-10-12");

        final LocalDate endBootcamp = LocalDate.parse("14/12/2023", simpleFormat);

        System.out.println("startBootcamp: " + startBootcamp);//2023-10-12
        System.out.println("endBootcamp: " + endBootcamp);//2023-12-14
    }

    public static void dateFormatterSample() {
        // define special formatter
        final DateTimeFormatter simpleFormat = ofPattern("dd/MM/yyyy");
        final DateTimeFormatter japFormat = ofPattern("d MMMM yyyy", Locale.ITALIAN);
        final DateTimeFormatter shortGermany = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)
                .withLocale(Locale.GERMAN);

        final LocalDate startBootcamp = LocalDate.of(2023, Month.OCTOBER, 12);

        System.out.println("simpleFormat: " + simpleFormat.format(startBootcamp));// 12/10/2023
        System.out.println("indoFormat  : " + japFormat.format(startBootcamp));// 12 ottobre 2023
        System.out.println("shortIndoFmt: " + shortGermany.format(startBootcamp));// 12.10.23
    }
}
