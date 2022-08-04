package org.modern.java13;

public class TextBlockExample {
    public static void main(String[] args) {
        var message = """
                Welcome
                to
                India.
                """;
        System.out.println("message = " + message);

        var json = """
                {
                name: "John",
                age: 29
                }
                """;
        System.out.println("json = " + json);
    }
}
