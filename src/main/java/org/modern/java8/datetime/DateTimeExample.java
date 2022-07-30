package org.modern.java8.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class DateTimeExample {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("df = " + df.format(date));
        
        df = new SimpleDateFormat("HH:mm:ss");
        System.out.println("df.format(date) = " + df.format(date));

        System.out.println("Calendar.getInstance().getTime() = " + Calendar.getInstance().getTime());

        System.out.println("------------------------------------");

        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
    }
}
