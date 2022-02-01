package com.epam.spring.homework2.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BeanF extends DefaultBean {

    public BeanF() {}

    public BeanF(String name, String value) {
        this.name = name;
        this.value = value;
    }
}
