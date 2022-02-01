package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeanA extends DefaultBean implements InitializingBean, DisposableBean {
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
}
