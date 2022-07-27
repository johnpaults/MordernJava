package org.modern.java8.function.optional;

import java.util.Optional;

public class OptionalOfExample {
    public static void main(String[] args) {
        Optional<String> hello = Optional.of("Hello");
        System.out.println("hello = " + hello);
        // Optional<String> hello1 = Optional.of(null); throws NOP Exceptions
        System.out.println("getWords = " + getWords());
    }

    public static Optional<String> getWords () {
        String[] str = new String[10];
        Optional<String> hello = Optional.ofNullable(str[1]);
        if(hello.isPresent())
            return hello;
        else
            return Optional.empty();
    }
}
