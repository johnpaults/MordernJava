package org.modern.java8.function.functionalinterfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String, String> concateName = (a, b) -> System.out.println(a + b);
        concateName.accept("Jai", "hind");
        BiConsumer<Integer, Integer> multiplier = (a, b) -> System.out.println(a*b);
        multiplier.accept(2,5);
    }
}
