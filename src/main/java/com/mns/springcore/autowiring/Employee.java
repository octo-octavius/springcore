package com.mns.springcore.autowiring;

public class Employee {
    private Address address;

    Employee() { super();}

    Employee(Address address) {
        System.out.println("COnstructor injection auto wire");
        this.address = address;
    }

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
