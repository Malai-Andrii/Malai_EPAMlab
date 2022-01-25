package com.epam.spring.homework2;

import com.epam.spring.homework2.beans.*;
import com.epam.spring.homework2.config.BeansConfigMaster;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
        System.out.println(MY_SEPARATOR);
        System.out.println("CONFIGURATION OF THE BEANS");
        System.out.println(context.getBean(BeanA.class));
        System.out.println(context.getBean(BeanB.class));
        System.out.println(context.getBean(BeanC.class));
        System.out.println(context.getBean(BeanD.class));
        System.out.println(context.getBean(BeanE.class));
        System.out.println(context.getBean(BeanF.class));
        context.close();
    }
}