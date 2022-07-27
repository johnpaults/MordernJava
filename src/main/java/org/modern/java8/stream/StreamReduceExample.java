package org.modern.java8.stream;

import org.modern.java8.function.functionalinterfaces.Instructor;
import org.modern.java8.function.functionalinterfaces.InstructorGenerator;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        int sum = integers.stream().reduce(0, (a,b) -> a+b);
        System.out.println("sum = " + sum);
        
        int multiply = integers.stream().reduce(10, (a,b) -> a*b);
        System.out.println("multiply = " + multiply);

        
        Optional instructor = InstructorGenerator.getAll().stream().reduce((s1, s2) -> s1.getExperience() > s2.getExperience() ? s1 : s2);
        if(instructor.isPresent())
            System.out.println("instructor.get() = " + instructor.get());

        // get total number of courses available online
        long totalCourses = InstructorGenerator.getAll().stream().filter(Instructor::isOnlineAvailable)
                .map(Instructor::getCourses).flatMap(List::stream).distinct().count();
        System.out.println("totalCourses = " + totalCourses);

        //get total number of experience of instructor with online
        long totalOnlineExperience = InstructorGenerator.getAll().stream().filter(Instructor::isOnlineAvailable)
                .map(Instructor::getExperience).reduce(0, Integer::sum);
        System.out.println("totalOnlineExperience = " + totalOnlineExperience);
    }
}
