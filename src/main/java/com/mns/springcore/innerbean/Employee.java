package com.mns.springcore.dependencycheck;

import org.springframework.beans.factory.annotation.Required;

public class Employee {
    private Address address;

    private int id;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    @Required
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                ", id=" + id +
                '}';
    }
}
