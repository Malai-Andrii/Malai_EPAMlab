package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class BeanB {
    private String name;
    private String value;

    public BeanB() {}

    public BeanB(String name, String value) {
        this.name = name;
        this.value = value;
    }

    private void initMethodForB() {
        System.out.println("initMethodFor_B");
    }

    private void initMethodFromBFPP() {
        System.out.println("initMethodFromBFPP_B");
    }

    private void destroyMethodForB() {
        System.out.println("destroyMethodFor_B");
    }

    @Override
    public String toString() {
        return name + " - " + value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
