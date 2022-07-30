package org.modern.java8.datetime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);
        localTime = LocalTime.of(18, 59);
        System.out.println("localTime = " + localTime);
        System.out.println("-------------------------------");

        System.out.println("localTime.getHour() = " + localTime.getHour());
        System.out.println("localTime.getSecond() = " + localTime.getSecond());
        System.out.println("localTime.plusMinutes(150) = " + localTime.plusMinutes(150));
        System.out.println("localTime.get(ChronoField.SECOND_OF_DAY) = " + localTime.get(ChronoField.SECOND_OF_DAY));
        System.out.println("localTime.with(LocalTime.MIDNIGHT) = " + localTime.with(LocalTime.MIDNIGHT));

    }
}
