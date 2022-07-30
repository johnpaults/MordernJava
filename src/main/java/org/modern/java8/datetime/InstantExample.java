package org.modern.java8.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoField;

public class InstantExample {
    public static void main(String[] args) {
        Instant timesInstant = Instant.now();
        System.out.println("timesInstant = " + timesInstant);
        System.out.println("timesInstant.getNano() = " + timesInstant.getNano());
        Instant now = Instant.now().plusSeconds(3600);
        Duration duration = Duration.between(timesInstant, now);
        System.out.println("duration.toSeconds() = " + duration.toSeconds());

        LocalDateTime localDateTime = LocalDateTime.ofInstant(timesInstant, ZoneId.systemDefault());
        System.out.println("localDateTime = " + localDateTime);
    }
}
