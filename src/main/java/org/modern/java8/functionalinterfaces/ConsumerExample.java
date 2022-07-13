package org.modern.java8.functionalinterfaces;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerExample {
    //Consumer is like setter
    public static void main(String[] args) {
        Consumer<String> c = (v) -> System.out.println("value is " + v);
        c.accept("hi there");
        Consumer<Integer> i = (x) -> System.out.println("x*x = " + x*x);
        i.accept(6);

        ArrayList<Instructor> instructors = new InstructorGenerator().getAll();

        System.out.println("---------------");
        Consumer<Instructor> c1 = (instructor) -> System.out.println("instructor = " + instructor);
        instructors.forEach(c1);
        System.out.println("---------------");

        System.out.println("--------------- instructor.getName()");
        Consumer<Instructor> c2 = (instructor) -> System.out.println(instructor.getName());
        instructors.forEach(c2);
        System.out.println("---------------");

        System.out.println("--------------- instructor.getCourses()");
        Consumer<Instructor> c3 = (instructor) -> System.out.println(instructor.getCourses());
        instructors.forEach(c3);
        System.out.println("---------------");

        System.out.println("--------------- Name and Course");
        instructors.forEach(c2.andThen(c3));
        System.out.println("---------------");

        System.out.println("--------------- Experience() > 5");
        instructors.forEach((s1) -> {
            if(s1.getExperience() > 5) {
                c2.andThen(c3).accept(s1);
            }
        });
        System.out.println("---------------");
    }
}
