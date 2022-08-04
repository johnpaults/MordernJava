package org.modern.java13;

import java.time.LocalDate;

public class SwitchExpresionExample {
    public static void main(String[] args) {
        String month = "Jan";
        String quater = switch (month.toUpperCase()) {
            case "JAN", "FEB", "MAR" -> {
                yield (LocalDate.now().isLeapYear() ? "First Quarter - Leap year" : "First Quarter");
            }
            case "APR", "MAY", "JUN" -> "Second Quarter";
            case "JUL", "AUG", "SEP" -> "Third Quarter";
            case "OCT", "NOV", "DEC" -> "Fourth Quarter";
            default -> "Unknown Quarter";
        };
        System.out.println("quater = " + quater);
    }
}
