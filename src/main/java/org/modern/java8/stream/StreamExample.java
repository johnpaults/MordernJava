package org.modern.java8.stream;

import org.modern.java8.function.functionalinterfaces.Instructor;
import org.modern.java8.function.functionalinterfaces.InstructorGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        // creating a map of names and courses whose exp is more than 10 and online courses

        Predicate<Instructor> isOnline = Instructor::isOnlineAvailable;
        Predicate<Instructor> hasExp = instructor -> instructor.getExperience() > 10;

        ArrayList<Instructor> instructors = InstructorGenerator.getAll();
        Map<String, List<String>> map = instructors.stream()
                .filter(isOnline)
                .filter(hasExp)
                .peek(System.out::println)
                .collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));

        System.out.println("map = " + map);

    }
}
