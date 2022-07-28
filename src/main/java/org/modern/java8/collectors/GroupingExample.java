package org.modern.java8.collectors;

import org.modern.java8.function.functionalinterfaces.Instructor;
import org.modern.java8.function.functionalinterfaces.InstructorGenerator;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GroupingExample {
    public static void main(String[] args) {
        List<String> names = List.of("John", "Josh", "Jyoti", "Jey", "Jason");
        Map<Integer, List<String>> nameMap = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("nameMap = " + nameMap);

        Map<Boolean, List<Instructor>> onlineMap = InstructorGenerator.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::isOnlineAvailable));
        System.out.println("genderMap = " + onlineMap);

        Map<String, Map<String, Boolean>> experienceMap = InstructorGenerator.getAll().stream()
                .collect(Collectors.groupingBy(instructor -> instructor.getExperience() > 10 ? "Seniors" : "Juniors",
                        Collectors.toMap(Instructor::getName, Instructor::isOnlineAvailable)));
        System.out.println("experienceMap = " + experienceMap);

        System.out.println("--------------------------------");

        Map<Integer, List<String>> lengthMap = names.stream().collect(Collectors.groupingBy(String::length,
                Collectors.filtering(s -> s.contains("o"), Collectors.toList())));
        System.out.println("lengthMap = " + lengthMap);

        Map<String, List<String>> experienceOnlineMap = InstructorGenerator.getAll().stream()
                .collect(Collectors.groupingBy(instructor -> instructor.getExperience() >= 10 ? "Seniors" : "Juniors",
                        Collectors.filtering(Instructor::isOnlineAvailable, Collectors.mapping(Instructor::getName, Collectors.toList()))));
        System.out.println("experienceMap = " + experienceOnlineMap);

    }
}
