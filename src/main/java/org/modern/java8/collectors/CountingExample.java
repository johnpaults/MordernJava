package org.modern.java8.collectors;

import org.modern.java8.function.functionalinterfaces.Instructor;
import org.modern.java8.function.functionalinterfaces.InstructorGenerator;

import java.util.stream.Collectors;

public class CountingExample {
    public static void main(String[] args) {
        long count = InstructorGenerator.getAll().stream()
                .filter(Instructor::isOnlineAvailable)
                .count();
        System.out.println("count = " + count);

        count = InstructorGenerator.getAll().stream()
                .filter(Instructor::isOnlineAvailable)
                .collect(Collectors.counting());

        System.out.println("count = " + count);
    }
}
