package com.mns.springcore.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class PatientInt implements InitializingBean, DisposableBean {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void onInit() {
        System.out.println("In onInit of patient " + name);
    }

    private void onDestroy() {
        System.out.println("In onDestroy of patient " + name);
    }

    @Override
    public String toString() {
        return "PatientInt{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("in destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After properties set");
    }


}
