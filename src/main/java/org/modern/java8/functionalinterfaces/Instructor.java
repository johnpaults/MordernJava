package org.modern.java8.functionalinterfaces;

import java.util.List;

public class Instructor {
    private String name;
    private List<String> courses;
    private int experience;
    private boolean isOnlineAvailable;

    public Instructor() {
    }

    public Instructor(String name, List<String> courses, int experience, boolean isOnlineAvailable) {
        this.name = name;
        this.courses = courses;
        this.experience = experience;
        this.isOnlineAvailable = isOnlineAvailable;
    }
    public Instructor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public boolean isOnlineAvailable() {
        return isOnlineAvailable;
    }

    public void setOnlineAvailable(boolean onlineAvailable) {
        isOnlineAvailable = onlineAvailable;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "name='" + name + '\'' +
                ", courses=" + courses +
                ", experience=" + experience +
                ", isOnlineAvailable=" + isOnlineAvailable +
                '}';
    }
}
