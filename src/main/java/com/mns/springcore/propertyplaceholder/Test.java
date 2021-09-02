package com.mns.springcore.propertyplaceholder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("propertyplaceholder.xml");
    UserDAO u = (UserDAO) ctx.getBean("userdao");
    System.out.println(u);
  }
}
