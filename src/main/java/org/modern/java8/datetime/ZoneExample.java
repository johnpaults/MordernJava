package org.modern.java8.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class ZoneExample {
    public static void main(String[] args) {
        // ZoneId.getAvailableZoneIds().stream().sorted().forEach(System.out::println);
        LocalDateTime system = LocalDateTime.now(ZoneId.systemDefault());
        System.out.println("system = " + system);
        LocalDateTime london = LocalDateTime.now(ZoneId.of("Europe/London"));
        System.out.println("london = " + london);
        LocalDateTime us = LocalDateTime.now(ZoneId.of("US/Central"));
        System.out.println("us = " + us);
    }
}
