package org.modern.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMaxExample {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Optional max = integers.stream().max(Integer::compareTo);
        if(max.isPresent())
            System.out.println("max.get() = " + max.get());

        Optional maxReduce = integers.stream().reduce(Integer::max);
        if(maxReduce.isPresent())
            System.out.println("maxReduce.get() = " + maxReduce.get());

        Optional minReduce = integers.stream().reduce(Integer::min);

        if(minReduce.isPresent())
            System.out.println("minReduce.get() = " + minReduce.get());
    }
}
