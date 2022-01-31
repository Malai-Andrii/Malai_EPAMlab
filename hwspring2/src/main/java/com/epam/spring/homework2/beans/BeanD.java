package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class BeanD extends DefaultBean {
    private String name;
    private String value;

    public BeanD() {}

    public BeanD(String name, String value) {
        this.name = name;
        this.value = value;
    }

    private void initMethodForD() {
        System.out.println("InitMethodFor_D");
    }

    private void destroyMethodForD() {
        System.out.println("destroyMethodFor_D");
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
