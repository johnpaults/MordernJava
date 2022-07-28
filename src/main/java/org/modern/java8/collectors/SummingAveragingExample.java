package org.modern.java8.collectors;

import org.modern.java8.function.functionalinterfaces.Instructor;
import org.modern.java8.function.functionalinterfaces.InstructorGenerator;

import java.util.stream.Collectors;

public class SummingAveragingExample {
    public static void main(String[] args) {
        //total experience of all the Instructors
        long sum = InstructorGenerator.getAll().stream().collect(Collectors.summingInt(Instructor::getExperience));
        System.out.println("sum = " + sum);
        
        double average = InstructorGenerator.getAll().stream().collect(Collectors.averagingInt(Instructor::getExperience));
        System.out.println("average = " + average);
    }
}
