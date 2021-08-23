package com.mns.springcore.dependencycheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx9 = new ClassPathXmlApplicationContext("dependencycheck.xml");
        Student employee = (Student)  ctx9.getBean("student");
        System.out.println(employee.toString());
    }
}
