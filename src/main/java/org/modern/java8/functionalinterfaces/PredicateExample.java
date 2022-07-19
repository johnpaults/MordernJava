package org.modern.java8.functionalinterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> p1 = i -> i > 10;

        Predicate<Integer> p2 = i -> i % 2 == 0;

        Predicate<Integer> p3 = i -> i != 0;

        System.out.println(p1.test(100));

        System.out.println(p1.and(p2).test(75));

        System.out.println(p1.and(p2).or(p3).test(45));

        System.out.println("--------------------------------------------------------------");

        List<Instructor> instructors = InstructorGenerator.getAll();

        Predicate<Instructor> i1 = instructor -> instructor.isOnlineAvailable();

        Predicate<Instructor> i2 = instructor -> instructor.getExperience() > 10;

        instructors.forEach((instructor) ->  {
            if(i1.test(instructor))
                System.out.println(instructor.getName() + " is available for online courses");
        });

        System.out.println("--------------------------------------------------------------");

        // Biconsumer with Predicate
        BiConsumer<String, List<String>> biConsumer = (name, courses) -> {
            System.out.println("Name is: " + name + " courses are " + courses);
        };
        instructors.forEach((instructor) ->  {
            if(i1.and(i2).test(instructor))
                biConsumer.accept(instructor.getName(), instructor.getCourses());
        });

        System.out.println("--------------------------------------------------------------");

        // BiPredicate Example
        BiPredicate<Instructor, Integer> biPredicate = (inst, expe) -> inst.isOnlineAvailable() == false && inst.getExperience() > expe;

        instructors.forEach((instructor) ->  {
            int exep = 10;
            if(biPredicate.test(instructor, exep))
                System.out.println(instructor.getName() + " is with more than "+ exep +" years of experience but" +
                        " not available for online courses");
        });
    }
}
