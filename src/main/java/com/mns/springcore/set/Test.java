package com.mns.springcore.set;

import com.mns.springcore.lc.interfaces.PatientInt;
import com.mns.springcore.lc.xmlconfig.Doctor;
import com.mns.springcore.list.Hospital;
import com.mns.springcore.map.Customer;
import com.mns.springcore.reftypes.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx3 = new ClassPathXmlApplicationContext("setconfig.xml");
        CarDealer cd = (CarDealer)  ctx3.getBean("cardealer");
        System.out.println(cd.getName());
        System.out.println(cd.getModels().toString());
        System.out.println(cd.getModels().getClass().getName());
    }
}
