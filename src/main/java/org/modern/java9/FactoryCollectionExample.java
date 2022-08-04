package org.modern.java9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FactoryCollectionExample {
    public static void main(String[] args) {
        //before Java 9
        List<String> oldName = new ArrayList<>();
        oldName.add("John");
        oldName.add("Jyoti");
        oldName.add("Josh");
        System.out.println("oldName = " + oldName);
        oldName = Collections.unmodifiableList(oldName);
        oldName.add("Jenny"); // UnsupportedOperationException here
        System.out.println("oldName = " + oldName);

        //After Java 9
        List<String> names = List.of("John", "Jyoti", "Josh");
        names.add("Jenny"); //UnsupportedOperationException
        names.sort(Comparator.naturalOrder()); //UnsupportedOperationException
        System.out.println("names = " + names);
    }
}
