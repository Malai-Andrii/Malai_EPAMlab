package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeanA implements InitializingBean, DisposableBean {
    private String name;
    private String value;

    public BeanA() {}

    public BeanA(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet_A");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy_A");
    }

    @Override
    public String toString() {
        return name + " - " + value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
