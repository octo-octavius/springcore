package com.mns.springcore.lc.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx9 = new ClassPathXmlApplicationContext("lcannotations.xml");
        ctx9.registerShutdownHook();
        PatientInt2 patient = (PatientInt2)  ctx9.getBean("patientInt2");
        System.out.println(patient.toString());
    }
}
