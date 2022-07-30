package org.modern.java8.variablescope;

import org.modern.java8.function.functionalinterfaces.Instructor;
import org.modern.java8.function.functionalinterfaces.InstructorGenerator;

import java.util.ArrayList;
import java.util.function.Consumer;

public class VariableScopeExample {

    public static void main(String[] args) {
        int k = 10;
        k++;
        int finalK = k;
        Consumer<Integer> mul = a -> System.out.println("a = " + a+ finalK);
        mul.accept(10);
        ArrayList<Instructor> instructors = InstructorGenerator.getAll();
        instructors.forEach((instructor) -> {
            System.out.println("instructor = " + instructor);
            System.out.println("k = " + finalK);
        });
    }
}
