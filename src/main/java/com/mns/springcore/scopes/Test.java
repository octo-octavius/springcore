package com.mns.springcore.scopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx9 = new ClassPathXmlApplicationContext("scopes.xml");
        Employee employee = (Employee) ctx9.getBean("employeeproto");
        System.out.println(employee.hashCode());
        System.out.println(employee.getAddress().hashCode());

        Employee employee2 = (Employee) ctx9.getBean("employeeproto");
        System.out.println(employee2.hashCode());
        System.out.println(employee2.getAddress().hashCode());
        System.out.println("---------------");

        Employee employee3 = (Employee) ctx9.getBean("employeesingleton");
        System.out.println(employee3.hashCode());
        System.out.println(employee3.getAddress().hashCode());

        Employee employee4 = (Employee) ctx9.getBean("employeesingleton");
        System.out.println(employee4.hashCode());
        System.out.println(employee4.getAddress().hashCode());
        System.out.println("---------------");

        Employee employee5 = (Employee) ctx9.getBean("employeesingleton2");
        System.out.println(employee5.hashCode());
        System.out.println(employee5.getAddress().hashCode());

        Employee employee6 = (Employee) ctx9.getBean("employeesingleton2");
        System.out.println(employee6.hashCode());
        System.out.println(employee6.getAddress().hashCode());
        System.out.println("---------------");

        Employee employee7 = (Employee) ctx9.getBean("employeeproto2");
        System.out.println(employee7.hashCode());
        System.out.println(employee7.getAddress().hashCode());

        Employee employee8 = (Employee) ctx9.getBean("employeeproto2");
        System.out.println(employee8.hashCode());
        System.out.println(employee8.getAddress().hashCode());
        System.out.println("---------------");
    }
}
