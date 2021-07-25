package com.mns.springcore.lc.interfaces;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx8 = new ClassPathXmlApplicationContext("lcinterfaces.xml");
        ctx8.registerShutdownHook();
        PatientInt patient = (PatientInt)  ctx8.getBean("patientInt");
        System.out.println(patient.toString());
    }
}
