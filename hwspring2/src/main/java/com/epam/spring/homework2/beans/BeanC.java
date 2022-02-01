package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class BeanC extends DefaultBean {

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

}
