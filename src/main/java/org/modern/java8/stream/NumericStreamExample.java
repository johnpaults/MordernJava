package org.modern.java8.stream;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamExample {
    public static void main(String[] args) {
        //Sum of 1000 numbers
        int sum = IntStream.rangeClosed(1, 1000).sum();
        System.out.println("sum = " + sum);
        OptionalInt min = IntStream.generate(new Random()::nextInt).limit(1000).min();
        System.out.println("min.getAsInt() = " + min.getAsInt());
        OptionalLong max = LongStream.generate(new Random() :: nextLong).limit(1000).max();
        System.out.println("max.getAsLong() = " + max.getAsLong());
        OptionalDouble avg = DoubleStream.generate(new Random() :: nextDouble).limit(1000).average();
        System.out.println("avg.getAsDouble() = " + avg.getAsDouble());
    }
}
