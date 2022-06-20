package org.example.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class CallableExample {
    public static int[] arr = IntStream.rangeClosed(0, 5000).toArray();
    public static int total = IntStream.rangeClosed(0, 5000).sum();

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<Integer> callable1 = () -> {
            int sum = 0;
            for (int i = 0; i < arr.length/2; i++)
                sum = sum + i;
            return sum;
        };

        Callable<Integer> callable2 = () -> {
            int sum = 0;
            for (int i = arr.length/2; i < arr.length; i++)
                sum = sum + i;
            return sum;
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Callable<Integer>> callableList = Arrays.asList(callable1, callable2);
        List<Future<Integer>> results = executorService.invokeAll(callableList);

        int k = 0, sum = 0;
        for (Future<Integer> result: results) {
            sum = sum + result.get();
            System.out.println("K is " + ++k);
        }
        System.out.println("Sum is " + sum);
        System.out.println("Total is " + total);
    }
}
