package org.modern.java8.collectors;

import org.modern.java8.function.functionalinterfaces.Instructor;
import org.modern.java8.function.functionalinterfaces.InstructorGenerator;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningExample {
    public static void main(String[] args) {
        String result = Stream.of("E", "F", "G", "H").collect(Collectors.joining());
        System.out.println("result = " + result);

        result = Stream.of("E,F", "G", "H").collect(Collectors.joining(","));
        System.out.println("result = " + result);

        result = Stream.of("E,F", "G", "H").collect(Collectors.joining(",", "{", "}"));
        System.out.println("result = " + result);
        
        String names = InstructorGenerator.getAll().stream().map(Instructor::getName).collect(Collectors.joining(",", "[", "]"));
        System.out.println("names = " + names);
    }
}
