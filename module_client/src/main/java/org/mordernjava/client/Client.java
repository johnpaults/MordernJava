package org.mordernjava.client;

import org.mordernjava.consumer.Consumer;
import org.mordernjava.producer.Producer;

import java.util.concurrent.ArrayBlockingQueue;

public class Client {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(5);
        Producer producer = new Producer(arrayBlockingQueue);
        Consumer consumer = new Consumer(arrayBlockingQueue);
    }
}
