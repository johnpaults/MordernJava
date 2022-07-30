package org.modern.java8.staticmethod;

public interface InterfaceB extends InterfaceA{
    default void sumB(int n1, int n2){
        System.out.println("InterfaceB.sumB n1+n2 = " + (n1+n2));
    }

    default void sumA(int n1, int n2){
        System.out.println("InterfaceB.sumA n1+n2 = " + (n1+n2));
    }
}
