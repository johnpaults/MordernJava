package org.modern.java8.function.methodreferance;

import org.modern.java8.function.functionalinterfaces.Instructor;

public interface IInstructorFactory {

    public abstract Instructor getInstructor(String name);
}
