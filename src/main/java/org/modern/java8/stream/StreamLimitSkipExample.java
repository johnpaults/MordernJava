package org.modern.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Optional lastFiveSum = integers.stream().skip(5).reduce(Integer::sum);
        if(lastFiveSum.isPresent())
            System.out.println("lastFiveSum.get() = " + lastFiveSum.get());

        int firstFiveSum = integers.stream().limit(5).reduce(0, Integer::sum);
        System.out.println("firstFiveSum = " + firstFiveSum);
    }
}
