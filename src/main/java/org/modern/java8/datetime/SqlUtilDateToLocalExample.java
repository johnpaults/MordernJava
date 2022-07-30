package org.modern.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class SqlUtilDateToLocalExample {
    public static void main(String[] args) {
        Date utilDate = new Date();
        System.out.println("utilDate = " + utilDate);
        LocalDateTime localDateTime = utilDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println("localDateTime = " + localDateTime);

        java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());
        System.out.println("sqlDate = " + sqlDate);
        LocalDate localDate = sqlDate.toLocalDate();
        System.out.println("localDate = " + localDate);
    }
}
