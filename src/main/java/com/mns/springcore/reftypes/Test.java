package com.mns.springcore.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx6 = new ClassPathXmlApplicationContext("refconfig.xml");
        Student student = (Student)  ctx6.getBean("student");
        System.out.println(student.toString());
    }
}
