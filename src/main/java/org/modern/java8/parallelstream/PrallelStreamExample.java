package org.modern.java8.parallelstream;

import java.util.stream.IntStream;

public class PrallelStreamExample {
    public static void main(String[] args) {
        System.out.println("streamSum() = " + streamSum());
        System.out.println("paralellSum() = " + paralellSum());
    }
    
    public static int streamSum() {
        return IntStream.rangeClosed(0, 1000).sum();
    }
    
    public static int paralellSum(){
        return IntStream.rangeClosed(0, 1000).parallel().sum();
    }
}
