package org.modern.java8.function.functionInterface;

import org.modern.java8.function.functionalinterfaces.Instructor;
import org.modern.java8.function.functionalinterfaces.InstructorGenerator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExample {
    // Function Interface will return value but Functional Interface won't return value.

    public static void main(String[] args) {
        Function<Integer, Double> f1 = (i) -> Math.sqrt(i);
        System.out.println("Square root of 10 is " + f1.apply(10));
        System.out.println("--------------------------------------------------------------");

        Function<String, String> concat = (s1) -> ("Programming in ").concat(s1);
        Function<String, String> uppercase = (s1) -> s1.toUpperCase();
        System.out.println(uppercase.andThen(concat).apply("java"));
        System.out.println("--------------------------------------------------------------");

        System.out.println(uppercase.compose(concat).apply("node"));
        System.out.println("--------------------------------------------------------------");

        Predicate<Instructor> p1 = instructor -> instructor.getExperience() > 10;
        Function<List<Instructor>, Map<String, Integer>> mapFunction = (instructors) -> {
            HashMap<String, Integer> map = new HashMap<>();
            instructors.forEach((inst) -> {
                if(p1.test(inst))
                    map.put(inst.getName(), inst.getExperience());
            });
            return map;
        };
        System.out.println(mapFunction.apply(InstructorGenerator.getAll()));
        System.out.println("--------------------------------------------------------------");

        BiFunction<List<Instructor>, Predicate<Instructor>, Map<String, Integer>> biFunction = (instructors, predicate) -> {
            HashMap<String, Integer> map = new HashMap<>();
            instructors.forEach((inst) -> {
                if(predicate.test(inst))
                    map.put(inst.getName(), inst.getExperience());
            });
            return map;
        };
        Predicate<Instructor> p2 = i -> i.isOnlineAvailable();
        System.out.println(biFunction.apply(InstructorGenerator.getAll(), p1.and(p2)));
        System.out.println("--------------------------------------------------------------");
    }
}
