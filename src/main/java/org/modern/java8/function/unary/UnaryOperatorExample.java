package org.modern.java8.function.unary;

import java.util.function.*;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        // argument and return type as same.
        UnaryOperator<Integer> unaryOperator = (i) -> i*100;
        System.out.println("unaryOperator.apply(10) = " + unaryOperator.apply(10));

        System.out.println("----------------------------------------");

        Function<Integer, Integer> functionOperator = (i) -> i*100;
        System.out.println("functionOperator.apply(10) = " + functionOperator.apply(100));

        System.out.println("----------------------------------------");

        IntUnaryOperator intUnaryOperator = (i) -> i*100;
        System.out.println("intUnaryOperator.applyAsInt(10) = " + intUnaryOperator.applyAsInt(1000));

        System.out.println("----------------------------------------");

        LongUnaryOperator longUnaryOperator = i -> i*100;
        System.out.println("longUnaryOperator.applyAsLong(1000) = " + longUnaryOperator.applyAsLong(10000));

        System.out.println("----------------------------------------");

        DoubleUnaryOperator doubleUnaryOperator = i -> i*100;
        System.out.println("doubleUnaryOperator.applyAsDouble(10000) = " + doubleUnaryOperator.applyAsDouble(100000));
    }
}
