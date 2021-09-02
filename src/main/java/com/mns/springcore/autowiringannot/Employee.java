package com.mns.springcore.autowiringannot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

// constructor injection -> field injection -> setter injection

public class Employee {
    @Autowired
    @Qualifier("address1")
    private Address address;

    Employee() { super();}

    // @Autowired
    //     //@Qualifier not applicable for constructor injection
    // Employee(Address address) {
    //     System.out.println("COnstructor injection auto wire");
    //     this.address = address;
    // }

    private int id;

    public Address getAddress() {
        return address;
    }

    @Autowired
    @Qualifier("address2")
    public void setAddress(Address address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

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
