package com.mns.springcore.lc.xmlconfig;

import java.util.List;

public class Doctor {
    private int id;
    private String name;
    private List<Patient> patients;

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
        this.name = name;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", patients=" + patients +
                '}';
    }

    private void onInit() {
        System.out.println("In onInit of " + this.getClass().getName());
    }

    private void onDestroy() {
        System.out.println("In onDestroy of " + this.getClass().getName());
    }
}
