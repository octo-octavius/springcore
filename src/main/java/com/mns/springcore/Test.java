package com.mns.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Employee ee = (Employee)  ctx.getBean("emp");
        System.out.println(ee.getName());
        System.out.println(ee.getId());
        System.out.println(ee.company);
        ee.setName("Sekhar1");

        Employee ee1 = (Employee)  ctx.getBean("emp");
        System.out.println(ee1.getName());
    }
}
