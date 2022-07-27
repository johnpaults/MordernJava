package org.modern.java8.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        List<Integer> numbers;

        IntStream intStream = IntStream.rangeClosed(0, 1000);
        numbers = intStream.boxed().collect(Collectors.toList());
        System.out.println("numbers = " + numbers);

        Optional<Integer> sum = numbers.stream().reduce((a, b) -> a+b );
        if(sum.isPresent())
            System.out.println("sum.get() = " + sum.get());

        int sumMap = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sumMap = " + sumMap);
    }
}
