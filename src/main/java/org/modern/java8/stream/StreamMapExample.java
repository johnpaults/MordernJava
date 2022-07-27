package org.modern.java8.stream;

import org.modern.java8.function.functionalinterfaces.Instructor;
import org.modern.java8.function.functionalinterfaces.InstructorGenerator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {
    public static void main(String[] args) {
        //return only instructor names
        ArrayList<Instructor> instructors = InstructorGenerator.getAll();
        List<String> names = instructors.stream().map(Instructor::getName).collect(Collectors.toList());
        System.out.println("names = " + names);

        List<String> courses = instructors.stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("courses = " + courses);

        long coursesCount = instructors.stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .count();
        System.out.println("coursesCount = " + coursesCount);
        
        boolean anyMatch = instructors.stream().map(Instructor::getCourses).flatMap(List::stream).anyMatch(s->s.startsWith("J"));
        System.out.println("anyMatch = " + anyMatch);
        boolean allMatch = courses.stream().allMatch(s -> s.startsWith("A"));
        System.out.println("allMatch = " + allMatch);
        boolean nonMatch = courses.stream().noneMatch(s -> s.startsWith("z"));
        System.out.println("nonMatch = " + nonMatch);

        List<String> sortedCourses = instructors.stream()
                .sorted(Comparator.comparing(Instructor::getName))
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("courses = " + courses);
        System.out.println("sortedCourses = " + sortedCourses);


    }
}
