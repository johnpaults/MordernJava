package org.modern.java8.collectors;

import org.modern.java8.function.functionalinterfaces.Instructor;
import org.modern.java8.function.functionalinterfaces.InstructorGenerator;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingMaxMinExample {
    public static void main(String[] args) {
        Map<Boolean, Optional<Instructor>> maxInstructors = InstructorGenerator.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::isOnlineAvailable,
                        Collectors.maxBy(Comparator.comparing(Instructor::getExperience))));
        System.out.println("maxInstructors = " + maxInstructors);
        Map<Boolean, Optional<Instructor>> minInstructors = InstructorGenerator.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::isOnlineAvailable,
                        Collectors.minBy(Comparator.comparing(Instructor::getExperience))));
        System.out.println("minInstructors = " + minInstructors);
        Map<Boolean, Instructor> maxIns = InstructorGenerator.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::isOnlineAvailable, Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparing(Instructor::getExperience)), Optional::get)));
        System.out.println("maxIns = " + maxIns);
        Map<Boolean, Double> avgExp = InstructorGenerator.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::isOnlineAvailable,
                        Collectors.averagingInt(Instructor::getExperience)));
        System.out.println("avgExp = " + avgExp);
        Map<Boolean, IntSummaryStatistics> intSummaryStatisticsMap = InstructorGenerator.getAll()
                .stream().collect(Collectors.groupingBy(Instructor::isOnlineAvailable,
                        Collectors.summarizingInt(Instructor::getExperience)));
        System.out.println("intSummaryStatisticsMap = " + intSummaryStatisticsMap);
    }
}