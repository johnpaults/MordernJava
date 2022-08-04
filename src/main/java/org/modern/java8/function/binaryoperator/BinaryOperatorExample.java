package org.modern.java8.function.binaryoperator;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class BinaryOperatorExample {
    // take two arguments of same type and returns value of same type.

    public static void main(String[] args) {
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        System.out.println("sum.apply(10,20) = " + sum.apply(10,20));
        System.out.println("----------------------------------------");

        IntBinaryOperator intMultiply = (a, b) -> a * b;
        System.out.println("intMultiply.applyAsInt(10,3) = " + intMultiply.applyAsInt(10,3));
        System.out.println("----------------------------------------");

        Comparator<Integer> comparator = (a,b) -> a.compareTo(b);

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println("maxBy.apply(5, 8) = " + maxBy.apply(5, 8));
        System.out.println("----------------------------------------");

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println("minBy.apply(10, 5) = " + minBy.apply(10, 5));
        System.out.println("----------------------------------------");
    }
}
