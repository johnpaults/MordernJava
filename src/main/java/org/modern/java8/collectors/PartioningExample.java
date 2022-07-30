package org.modern.java8.collectors;

import org.modern.java8.function.functionalinterfaces.Instructor;
import org.modern.java8.function.functionalinterfaces.InstructorGenerator;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PartioningExample {
    public static void main(String[] args) {
        //Partition Instructor on experience > 10
        Predicate<Instructor> expePredicate = instructor -> instructor.getExperience() > 10;
        Map<Boolean, List<Instructor>> partListMap = InstructorGenerator.getAll().stream()
                .collect(Collectors.partitioningBy(expePredicate));
        System.out.println("partListMap = " + partListMap);
        System.out.println("---------------------------------------");

        Map<Boolean, Set<Instructor>> partSetMap = InstructorGenerator.getAll().stream()
                .collect(Collectors.partitioningBy(expePredicate, Collectors.toSet()));
        partSetMap.forEach((k, v) -> {
            System.out.println("Key:" + k + " Value: " + v);
        });
        System.out.println("---------------------------------------");

        Map<Boolean, Map<String, Integer>> partMap = InstructorGenerator.getAll().stream()
                .collect(Collectors.partitioningBy(expePredicate, Collectors.toMap(Instructor::getName, Instructor::getExperience)));
        partMap.forEach((k, v) -> {
            System.out.println("Key:" + k + " Value: " + v);
        });
        System.out.println("---------------------------------------");


    }
}
