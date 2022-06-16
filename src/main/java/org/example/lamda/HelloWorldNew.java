package org.example.lamda;

public class HelloWorldNew {
    public static void main(String[] args) {
        HelloLamda helloLamda = () -> "Hey New";

        System.out.println(helloLamda.sayHello());
    }
}
