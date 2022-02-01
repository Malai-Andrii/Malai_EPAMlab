package com.epam.spring.homework2;

import com.epam.spring.homework2.beans.*;
import com.epam.spring.homework2.config.BeansConfigMaster;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Application {
    private static final String MY_SEPARATOR = "===================";

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeansConfigMaster.class);
        System.out.println(MY_SEPARATOR);
        System.out.println("ENUM OF CREATED BEANS");
        for (String bean : context.getBeanDefinitionNames()) {
            System.out.println(bean);
        }
        Arrays.stream(context.getBeanDefinitionNames()).forEach(s -> System.out.println(context.getBeanDefinition(s)));
        context.close();
    }
}