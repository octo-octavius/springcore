package com.mns.springcore.innerbean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx9 = new ClassPathXmlApplicationContext("innerbean.xml");
        Employee employee = (Employee)  ctx9.getBean("employee");
        System.out.println(employee.toString());
    }
}
