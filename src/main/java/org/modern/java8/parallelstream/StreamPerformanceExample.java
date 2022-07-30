package org.modern.java8.parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class StreamPerformanceExample {
    public static void main(String[] args) {
        int n = 20;
        System.out.println("time taken for sequentionalSum() = " + measurePerformance(StreamPerformanceExample::sequentionalSum, n));
        System.out.println("time taken for paralellSum() = " + measurePerformance(StreamPerformanceExample::paralellSum, n));
    }

    public static int sequentionalSum() {
        return IntStream.rangeClosed(0, 1000000).sum();
    }

    public static int paralellSum(){
        return IntStream.rangeClosed(0, 1000000).parallel().sum();
    }

    public static long measurePerformance(Supplier<Integer> supplier, int n){
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            supplier.get();
        }
        return System.currentTimeMillis() - start;
    }
}
