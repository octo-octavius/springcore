package com.mns.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx5 = new ClassPathXmlApplicationContext("propconfig.xml");
        CountriesAndLanguages cl = (CountriesAndLanguages)  ctx5.getBean("countriesAndLangs");
        System.out.println(cl.getCountriesAndLang().toString());
        System.out.println(cl.getCountriesAndLang().getProperty("USA"));
        System.out.println(cl.getCountriesAndLang().containsKey("Spaina"));
        System.out.println(cl.getCountriesAndLang().getProperty("Denmark").getClass().getName());
    }
}
