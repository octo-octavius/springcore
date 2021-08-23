package com.mns.springcore.constructorinjection;

public class Manager {
    private String name;
    private String id;

    public Manager(String name, String id) {
        System.out.println("Constructor invoked string id");
        this.name = name;
        this.id = id;
    }

    public Manager(String name, int id) {
        System.out.println("Constructor invoked int id");
        this.name = name;
        this.id = Integer.toString(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Setter name");
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        System.out.println("Setter name");
        this.id = id;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
