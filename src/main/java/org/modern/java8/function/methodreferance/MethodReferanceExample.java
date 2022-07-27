package org.modern.java8.function.methodreferance;

import org.modern.java8.function.functionalinterfaces.Instructor;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferanceExample {
    public static void main(String[] args) {
        Function<Integer, Double> fun = (n) -> Math.sqrt(n);
        System.out.println("fun.apply(10.0) = " + fun.apply(10));
        System.out.println("------------------------------");
        Function<Integer, Double> function = Math::sqrt;
        System.out.println("function.apply(5.0) = " + function.apply(5));
        System.out.println("------------------------------");
        Predicate<Instructor> predicate = Instructor::isOnlineAvailable;
        Function<String, String> toUpper = String::toUpperCase;
        System.out.println("toUpper.apply(\"john\") = " + toUpper.apply("john"));
        System.out.println("------------------------------");

        BiFunction<Integer, Integer, Integer> sum = MethodReferanceExample::addNumber;
        System.out.println("sum.apply(10, 20) = " + sum.apply(10, 20));
        System.out.println("------------------------------");

        IInstructorFactory iInstructorFactory = Instructor::new;
        System.out.println("iInstructorFactory.getInstructor(\"John\") = " + iInstructorFactory.getInstructor("John"));
        System.out.println("------------------------------");
    }

    public static Integer addNumber (Integer a, Integer b) {
        return a + b;
    }
}
