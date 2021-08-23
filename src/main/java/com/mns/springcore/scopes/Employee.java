package com.mns.springcore.innerbean;

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
