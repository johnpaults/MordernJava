package org.modern.java8.supplier;

import java.util.function.Supplier;

public class SupplierExample {
    //Supplier is like getter method;

    public static void main(String[] args) {
        Supplier<Double> supplier = () -> Math.random() * 100;
        System.out.println("supplier.get() = " + supplier.get());
        System.out.println("supplier.get() = " + supplier.get());
    }
}
