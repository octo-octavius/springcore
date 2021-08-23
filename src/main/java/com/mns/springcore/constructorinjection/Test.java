package com.mns.springcore.constructorinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("constructorinjection.xml");
        Store s = (Store)  ctx.getBean("store");
        System.out.println(s.getManager());
        System.out.println(s.getId());
    }
}
