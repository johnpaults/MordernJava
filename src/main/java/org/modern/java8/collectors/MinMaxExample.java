package org.modern.java8.collectors;

import org.modern.java8.function.functionalinterfaces.Instructor;
import org.modern.java8.function.functionalinterfaces.InstructorGenerator;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinMaxExample {
    public static void main(String[] args) {
        //instructor with minimum experiense
        Optional minInstructor = InstructorGenerator.getAll().stream()
                .collect(Collectors.minBy(Comparator.comparing(Instructor::getExperience)));
        if(minInstructor.isPresent())
            System.out.println("minInstructor.get() = " + minInstructor.get());
        minInstructor = InstructorGenerator.getAll().stream().min(Comparator.comparing(Instructor::getExperience));
        if (minInstructor.isPresent())
            System.out.println("minInstructor.get() = " + minInstructor.get());

        Map<Integer, Optional<Instructor>> min = InstructorGenerator.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::getExperience,
                        Collectors.minBy(Comparator.comparing(Instructor::getExperience))));
        System.out.println("min = " + min);

        System.out.println("------------------------------------");

        //instructor with maximum experience
        Optional maxInstructor = InstructorGenerator.getAll().stream()
                .collect(Collectors.maxBy(Comparator.comparing(Instructor::getExperience)));
        if(minInstructor.isPresent())
            System.out.println("maxInstructor.get() = " + maxInstructor.get());
        maxInstructor = InstructorGenerator.getAll().stream().max(Comparator.comparing(Instructor::getExperience));
        if (maxInstructor.isPresent())
            System.out.println("minInstructor.get() = " + maxInstructor.get());

        Map<Integer, Optional<Instructor>> max = InstructorGenerator.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::getExperience,
                        Collectors.maxBy(Comparator.comparing(Instructor::getExperience))));
        System.out.println("max = " + max);


    }
}
