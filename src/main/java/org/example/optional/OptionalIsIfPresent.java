package org.example.optional;

import java.util.Optional;

public class OptionalIsIfPresent {
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        arr[0] = 123;
        Optional<Integer> optional = Optional.ofNullable(arr[0]);
        if(optional.isPresent())
            System.out.println(" arr = " + optional.get());

        optional.ifPresent((s) -> System.out.println("optional.get() = " + optional.get()));
    }
}
