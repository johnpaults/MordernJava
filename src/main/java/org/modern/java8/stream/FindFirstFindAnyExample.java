package org.modern.java8.stream;

import org.modern.java8.function.functionalinterfaces.Instructor;
import org.modern.java8.function.functionalinterfaces.InstructorGenerator;

import java.util.Optional;

public class FindFirstFindAnyExample {
    public static void main(String[] args) {
        Optional findAny = InstructorGenerator.getAll().stream().filter(Instructor::isOnlineAvailable).findAny();
        if (findAny.isPresent())
            System.out.println("findAny.get() = " + findAny.get());
        Optional findFirst = InstructorGenerator.getAll().stream().filter(Instructor::isOnlineAvailable).findFirst();
        if (findFirst.isPresent())
            System.out.println("findFirst.get() = " + findFirst.get());
    }
}
