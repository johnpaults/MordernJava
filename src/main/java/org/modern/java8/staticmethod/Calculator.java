package org.modern.java8.staticmethod;

public interface Calculator {
    int sum (int n1, int n2);

    int divide (int n1, int n2);

    default int subtract (int n1, int n2) {
        return Math.subtractExact(n1, n2);
    }

    static int multiply (int n1, int n2) {
        return Math.multiplyExact(n1, n2);
    }
}
