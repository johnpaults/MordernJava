package org.modern.java8.function.optional;

import java.util.Optional;

public class OptionalOrElseThrow {
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        arr[0] = 123;
        Optional<Integer> optional = Optional.ofNullable(arr[1]);
        int result = optional.orElse(-1);
        System.out.println("result with orElse = " + result);
        result = optional.orElseGet(() -> -2);
        System.out.println("result with orElse Supplier = " + result);
        try {
            optional = Optional.ofNullable(arr[0]);
            result = optional.orElseThrow(Exception :: new);
            System.out.println("result with orElseThrow = " + result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
