package org.modern.java8.function.functionalinterfaces;

import java.util.ArrayList;
import java.util.Arrays;

public class InstructorGenerator {
    public static ArrayList<Instructor> getAll() {
        ArrayList<Instructor> instructors = new ArrayList<>();
        instructors.add(new Instructor("john", Arrays.asList("Computer Science", "English"), 5 , false));
        instructors.add(new Instructor("Jay", Arrays.asList("DSA", "Node", "Vue.js", "Nest.js", " Advanced JS"), 15 , true));
        instructors.add(new Instructor("Josh", Arrays.asList("HTML", "CSS", "JS"), 7 , true));
        instructors.add(new Instructor("James", Arrays.asList("HTML", "CSS", "JS"), 7 , false));
        instructors.add(new Instructor("Jenny", Arrays.asList("Java", "Spring Boot", "Hibernate", "DBMS", "MySQL"), 8 , true));
        instructors.add(new Instructor("Joice", Arrays.asList("Angular", "Vue.js", "Nest.js", "Advanced JS"), 11 , true));
        instructors.add(new Instructor("Joy", Arrays.asList("DBMS", "MySQL", "MongoDB", "NoSQL", "English"), 12 , false));
        return instructors;
    }
}
