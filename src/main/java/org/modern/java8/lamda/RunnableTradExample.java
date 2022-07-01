package org.modern.java8.lamda;

public class RunnableTradExample {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 1; i < 10; i++)
                    sum = sum + i;
                System.out.println("Sum is " + sum);
            }
        };
        new Thread(runnable).start();

        //Lamda example

        Runnable lamdaRunnable = () -> {
            int sum = 0;
            for (int i = 1; i < 10; i++)
                sum = sum + i;
            System.out.println("Lamda Sum is " + sum);
        };

        new Thread(lamdaRunnable).start();

        //Implement Thread with lamda

        new Thread(() -> {
            int sum = 0;
            for (int i = 1; i < 10; i++)
                sum = sum + i;
            System.out.println("\"Lamda Implemented in thread\" Sum is " + sum);
        }).start();
    }
}
