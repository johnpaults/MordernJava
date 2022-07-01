package org.modern.java8.lamda;

public class HelloWorldNew {
    public static void main(String[] args) {
        HelloLamda helloLamda = () -> "Hey New";
        System.out.println(helloLamda.sayHello());
        IncrementNumber incrementNumber = (a, b) -> a + b;
        System.out.println("Increment 5 by 10 = " +
                incrementNumber.increment(5, 10));
    }
}
