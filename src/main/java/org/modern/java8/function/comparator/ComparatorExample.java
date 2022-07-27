package org.modern.java8.function.comparator;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class ComparatorExample {
    public static void main(String[] args) {
        Comparator<Integer> comparator = (a, b) -> a.compareTo(b);

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println("maxBy.apply(5, 8) = " + maxBy.apply(5, 8));
        System.out.println("----------------------------------------");

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println("minBy.apply(10, 5) = " + minBy.apply(10, 5));
        System.out.println("----------------------------------------");

        BiFunction<Integer, Integer, Integer> maxValue = comparator::compare;
        System.out.println("maxValue.apply(6, 4) = " + maxValue.apply(6, 4));

        System.out.println("maxValue.apply(4, 5) = " + maxValue.apply(4, 5));

        System.out.println("maxValue.apply(4, 4) = " + maxValue.apply(4, 4));
    }
}
