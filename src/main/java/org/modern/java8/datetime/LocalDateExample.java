package org.modern.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);

        localDate = LocalDate.ofYearDay(2019, 345);
        System.out.println("localDate = " + localDate);

        localDate = LocalDate.of(2019, 12, 11);
        System.out.println("localDate = " + localDate);

        System.out.println("localDate.getMonth() = " + localDate.getMonth());
        System.out.println("localDate.getMonthValue() = " + localDate.getMonthValue());
        System.out.println("localDate.getDayOfMonth() = " + localDate.getDayOfMonth());
        System.out.println("localDate.get(ChronoField.DAY_OF_WEEK) = " + localDate.get(ChronoField.DAY_OF_WEEK));
        System.out.println("localDate.plusDays(4) = " + localDate.plusDays(4));
        System.out.println("localDate.plusWeeks(3) = " + localDate.plusWeeks(3));
        System.out.println("localDate = " + localDate);
        System.out.println("localDate.withYear(2022) = " + localDate.withYear(2022));
        System.out.println("localDate.with(ChronoField.YEAR, 2021) = " + localDate.with(ChronoField.YEAR, 2021));
    }
}
