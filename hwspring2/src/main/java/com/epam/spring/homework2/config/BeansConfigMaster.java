package com.epam.spring.homework2.config;

import com.epam.spring.homework2.beans.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan
@Import(BeansConfigSlave.class)
@PropertySource("beans.properties")
public class BeansConfigMaster {

    private final Environment env;

    public BeansConfigMaster(Environment env) {
        this.env = env;
    }

    @Bean(initMethod = "initMethodForB", destroyMethod = "destroyMethodForB")
    public BeanB beanB() {
        BeanB beanB = new BeanB();
        beanB.setName(env.getProperty("beanB.name"));
        beanB.setValue(env.getProperty("beanB.value"));
        return beanB;
    }

    @Bean(initMethod = "initMethodForC", destroyMethod = "destroyMethodForC")
    public BeanC beanC() {
        BeanC beanC = new BeanC();
        beanC.setName(env.getProperty("beanC.name"));
        beanC.setValue(env.getProperty("beanC.value"));
        return beanC;
    }

    @Bean(initMethod = "initMethodForD", destroyMethod = "destroyMethodForD")
    public BeanD beanD() {
        BeanD beanD = new BeanD();
        beanD.setName(env.getProperty("beanD.name"));
        beanD.setValue(env.getProperty("beanD.value"));
        return beanD;
    }

    @Bean
    public static CustomBeanFactory beanFactoryPostProcessor() {
        return new CustomBeanFactory();
    }

    @Bean
    public static CustomBeanPostProcessor beanPostProcessor() {
        return new CustomBeanPostProcessor();
    }
}
