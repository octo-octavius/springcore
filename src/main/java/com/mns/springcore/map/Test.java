package com.mns.springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx4 = new ClassPathXmlApplicationContext("mapconfig.xml");
        Customer customer = (Customer)  ctx4.getBean("customer");
        System.out.println(customer.getId());
        System.out.println(customer.getProducts().toString());
        System.out.println(customer.getProducts().getClass().getName());
    }
}
