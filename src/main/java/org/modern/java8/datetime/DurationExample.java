package org.modern.java8.datetime;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationExample {
    public static void main(String[] args) {
        //Durations are not used in Dates
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime plusNow = LocalDateTime.now().plusHours(2);

        Duration duration = Duration.between(now, plusNow);
        System.out.println("duration.toHours() = " + duration.toHours());
        System.out.println("duration.toSeconds() = " + duration.toSeconds());
    }
}
