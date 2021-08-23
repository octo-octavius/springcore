package com.mns.springcore.dependencycheck;

import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class Student {
    private String id;
    private List<String> courses;

    public String getId() {
        return id;
    }

    @Required
    public void setId(String id) {
        this.id = id;
    }

    public List<String> getCourses() {
        return courses;
    }

    @Required
    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", courses=" + courses +
                '}';
    }
}
