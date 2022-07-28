package org.modern.java8.collectors;

import org.modern.java8.function.functionalinterfaces.Instructor;
import org.modern.java8.function.functionalinterfaces.InstructorGenerator;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MappingExample {
    public static void main(String[] args) {
        List<String> names = InstructorGenerator.getAll().stream()
                .map(Instructor::getName).collect(Collectors.toList());
        System.out.println("names = " + names);

        names = InstructorGenerator.getAll().stream()
                .collect(Collectors.mapping(Instructor::getName, Collectors.toList()));
        System.out.println("names = " + names);

        Map<Integer, Map<String, List<String>>> mapCourses = InstructorGenerator.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::getExperience,
                        Collectors.toMap(Instructor::getName, Instructor::getCourses)));
        System.out.println("map = " + mapCourses);

        Map<Integer, List<String>> map = InstructorGenerator.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::getExperience,
                        Collectors.mapping(Instructor::getName, Collectors.toList())));

        System.out.println("map = " + map);
    }
}
