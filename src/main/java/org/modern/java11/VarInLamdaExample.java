package org.modern.java11;

import org.modern.java8.function.functionalinterfaces.Instructor;
import org.modern.java8.function.functionalinterfaces.InstructorGenerator;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class VarInLamdaExample {
    public static void main(String[] args) {
        var instructors = InstructorGenerator.getAll();
        Predicate<Instructor> expPredicate = (var s) -> s.getExperience() > 10;
        instructors.forEach(instructor -> {
            if(expPredicate.test(instructor)){
                System.out.println("instructor.getName() = " + instructor.getName());
            }
        });

        BiFunction<Integer, Integer, Integer> sum = (var a, var b) -> a+b;
        System.out.println("sum.apply(4, 6) = " + sum.apply(4, 6));
    }
}
