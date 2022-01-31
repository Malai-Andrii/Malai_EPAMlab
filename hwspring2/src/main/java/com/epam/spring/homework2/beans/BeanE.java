package com.epam.spring.homework2.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanE extends DefaultBean {
    private String name;
    private String value;

    public BeanE() {}

    public BeanE(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @PostConstruct
    public void postConstructForE() {
        System.out.println("postConstructFor_E");
    }

    @PreDestroy
    public void preDestroyForE() {
        System.out.println("preDestroyFor_E");
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
