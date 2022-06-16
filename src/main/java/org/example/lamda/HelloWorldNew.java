package org.example.lamda;

public class HelloWorldNew {
    public static void main(String[] args) {
        HelloLamda helloLamda = () -> {
            return "Hey New";
        };

        System.out.println(helloLamda.sayHello());
    }
}
