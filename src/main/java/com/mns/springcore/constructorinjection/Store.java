package com.mns.springcore.constructorinjection;

public class Store {
    private int id;
    private Manager manager;

    public Store(int id, Manager manager) {
        System.out.println("Store constructor");
        this.id = id;
        this.manager = manager;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", manager=" + manager +
                '}';
    }
}
