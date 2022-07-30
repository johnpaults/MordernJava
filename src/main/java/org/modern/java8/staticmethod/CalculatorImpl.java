package org.modern.java8.staticmethod;

public class CalculatorImpl implements Calculator{

    public static void main(String[] args) {
        CalculatorImpl calculator = new CalculatorImpl();
        System.out.println("calculator.sum(10, 36) = " + calculator.sum(10, 36));
        System.out.println("calculator.subtract(45, 8) = " + calculator.subtract(45, 8));
        System.out.println("calculator.divide(50, 5) = " + calculator.divide(50, 5));
        System.out.println("Calculator.multiply(5, 7) = " + Calculator.multiply(5, 7));
    }

    @Override
    public int sum(int n1, int n2) {
        return Math.addExact(n1, n2);
    }

    @Override
    public int divide(int n1, int n2) {
        return n1 / n2;
    }
}
