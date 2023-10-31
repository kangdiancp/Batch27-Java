package com.bootcamp.day04;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise06 {
    public static void main(String[] args) {
        zoneIdExample();
    }

    static void zoneIdExample() {
        //using java functional programming
        final Stream<String> zoneIdNames = Stream.of("Asia/Bangkok",
                "America/Los_Angeles",
                "Europe/Zurich");

        zoneIdNames.forEach(zoneIdName -> {
            final ZoneId zoneId = ZoneId.of(zoneIdName);
            var someDay = ZonedDateTime.of(LocalDate.parse("2023-10-30"),
                    LocalTime.parse("09:30:15"), zoneId);
            System.out.println(zoneIdName + " : " + someDay);
        });

        final Set<String> allZones = ZoneId.getAvailableZoneIds();
        final Predicate<String> inAsia = name -> name.startsWith("Asia/");

        final List<String> filterAsiaTimeZone = 
            allZones.stream()
            .filter(inAsia).limit(10)
            .collect(Collectors.toList());
        
        System.out.println("\nTimezones in Asia:");
        filterAsiaTimeZone.forEach(System.out::println);
    }
}
