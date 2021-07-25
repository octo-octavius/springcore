package com.mns.springcore.lc.xmlconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx7 = new ClassPathXmlApplicationContext("lcconfig.xml");
        ctx7.registerShutdownHook();
        Doctor doctor = (Doctor)  ctx7.getBean("doctor");
        System.out.println(doctor.toString());
    }
}
