package org.modern.java8.functionalinterfaces;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class NumberConsumers {
    public static void main(String[] args) {
        IntConsumer intConsumer = a -> System.out.println(a*10);
        LongConsumer longConsumer = a -> System.out.println(a*100);
        DoubleConsumer doubleConsumer = a -> System.out.println(a*1000);
        intConsumer.accept(24);
        longConsumer.accept(24l);
        doubleConsumer.accept(24D);
    }
}
