package org.modern.java8.staticmethod;

public interface InterfaceA {
    default void sumA(int n1, int n2){
        System.out.println("InterfaceA.sumA n1+n2 = " + (n1+n2));
    }
}
