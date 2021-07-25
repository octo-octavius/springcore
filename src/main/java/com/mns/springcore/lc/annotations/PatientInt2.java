package com.mns.springcore.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class PatientInt2 {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Setter on name called");
        this.name = name;
    }

    @Override
    public String toString() {
        return "PatientInt2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @PostConstruct
    private void onInit() {
        System.out.println("In onInit of patient " + name);
    }

    @PreDestroy
    private void onDestroy() {
        System.out.println("In onDestroy of patient " + name);
    }
}
