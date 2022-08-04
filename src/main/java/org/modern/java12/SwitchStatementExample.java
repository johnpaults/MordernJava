package org.modern.java12;

public class SwitchStatementExample {
    public static void main(String[] args) {
        // Before Java 12
        var month = "Aug";
        String quarter = "";
        switch (month.toUpperCase()) {
            case "JAN", "FEB", "MAR":
                quarter = "First Quarter";
                break;
            case "APR", "MAY", "JUN":
                quarter = "Second Quarter";
                break;
            case "JUL", "AUG", "SEP":
                quarter = "Third Quarter";
                break;
            case "OCT", "NOV", "DEC":
                quarter = "Fourth Quarter";
                break;
            default:
                quarter = "Unknown Quarter";
        }
        System.out.println("quarter = " + quarter);
        System.out.println("------------------------------------------------");
        month = "dec";
        quarter = switch (month.toUpperCase()) {
            case "JAN", "FEB", "MAR" -> "First Quarter";
            case "APR", "MAY", "JUN" -> "Second Quarter";
            case "JUL", "AUG", "SEP" -> "Third Quarter";
            case "OCT", "NOV", "DEC" -> "Fourth Quarter";
            default -> "Unknown Quarter";
        };
        System.out.println("quarter = " + quarter);
    }
}
