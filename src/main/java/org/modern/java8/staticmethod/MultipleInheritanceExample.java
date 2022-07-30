package org.modern.java8.staticmethod;

import java.util.Arrays;

public class MultipleInheritanceExample implements InterfaceA, InterfaceB, InterfaceC{
    public static void main(String[] args) {
        MultipleInheritanceExample multipleInheritanceExample = new MultipleInheritanceExample();
        multipleInheritanceExample.sumA(6,7);
        multipleInheritanceExample.sumB(8,9);
        multipleInheritanceExample.sumC(9, 10);
    }
}
