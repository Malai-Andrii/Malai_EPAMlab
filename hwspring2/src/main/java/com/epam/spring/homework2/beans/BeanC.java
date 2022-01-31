package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class BeanC extends DefaultBean {
    private String name;
    private String value;

    public BeanC() {}

    public BeanC(String name, String value) {
        this.name = name;
        this.value = value;
    }

    private void initMethodForC() {
        System.out.println("InitMethodFor_C");
    }

    private void destroyMethodForC() {
        System.out.println("destroyMethodFor_C");
    }

    @Override
    public String toString() {
        return name + " - " + value;
    }

    @Override
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
