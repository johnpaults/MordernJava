package org.modern.java8.methodreferance;

import org.modern.java8.functionalinterfaces.Instructor;

public interface IInstructorFactory {

    public abstract Instructor getInstructor(String name);
}
