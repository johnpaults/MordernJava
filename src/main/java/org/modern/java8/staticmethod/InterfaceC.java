package org.modern.java8.staticmethod;

public interface InterfaceC {
    default void sumC(int n1, int n2){
        System.out.println("InterfaceC n1+n2 = " + (n1+n2));
    }
}
