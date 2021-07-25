package com.mns.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx2 = new ClassPathXmlApplicationContext("listconfig.xml");
        Hospital hos = (Hospital)  ctx2.getBean("hospital");
        System.out.println(hos.getName());
        System.out.println(hos.getDepartments().toString());
        System.out.println(hos.getDepartments().getClass().getName());
    }
}
