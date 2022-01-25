package com.epam.spring.homework2.config;

import com.epam.spring.homework2.beans.BeanA;
import com.epam.spring.homework2.beans.BeanF;
import com.epam.spring.homework2.beans.BeanE;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfigSlave {
    @Bean
    public BeanA beanA() {
        return new BeanA("nameA", "1");
    }

    @Bean
    public BeanE beanE() {
        return new BeanE("nameE", "2");
    }

    @Bean
    public BeanF beanF() {
        return new BeanF("nameF", "3");
    }
}
