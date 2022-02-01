package com.epam.spring.homework2.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanE extends DefaultBean {
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
}
