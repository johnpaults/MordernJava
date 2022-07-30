package org.modern.java8.staticmethod;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StaticMethodExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Hello", "Joshua", "Jyoti");
        Collections.sort(names);
        System.out.println("names = " + names);
        System.out.println("--------------------------------");
        names = Arrays.asList("John", "Hello", "Joshua", "Jyoti", null);
        names.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println("names = " + names);
        
    }
}
