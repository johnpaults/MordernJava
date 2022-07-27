package org.modern.java8.function.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        // int number = arr[1];
        // NullPointerExecption here
        Optional<Integer> optional = Optional.ofNullable(arr[1]);
        int num = optional.isPresent() ? optional.get() : -1;
        System.out.println("num = " + num);
    }
}
