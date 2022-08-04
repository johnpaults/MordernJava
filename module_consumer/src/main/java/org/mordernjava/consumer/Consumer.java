package org.mordernjava.consumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Consumer {

    ArrayBlockingQueue<Integer> arrayBlockingQueue;
    public Consumer(ArrayBlockingQueue<Integer> arrayBlockingQueue){
        this.arrayBlockingQueue = arrayBlockingQueue;
        Runnable consumer = () -> {
            while (true){
                try {
                    TimeUnit.MICROSECONDS.sleep(5000);
                    Integer poll =  arrayBlockingQueue.take();
                    System.out.println("Polled: " +poll);
                    TimeUnit.MICROSECONDS.sleep(20);

                } catch (InterruptedException interruptedException){
                    interruptedException.printStackTrace();
                }
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(consumer);
        executorService.shutdown();
    }
}
