package org.modern.java8.lamda;

public class HelloLamdaTraditional implements HelloLamda{

    @Override
    public String sayHello() {
        return "Hello Old";
    }

    public static void main(String[] args) {
        HelloLamdaTraditional hlt = new HelloLamdaTraditional();
        System.out.println(hlt.sayHello());
    }
}
