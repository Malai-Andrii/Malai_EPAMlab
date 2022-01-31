package com.epam.spring.homework2.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof DefaultBean) {
            DefaultBean defaultBean = (DefaultBean) bean;
            if (defaultBean.getName() == null)
                System.out.println(beanName + "`s name is not valid!!!");
            try {
                if (Integer.parseInt(defaultBean.getValue()) < 1)
                    System.out.println(beanName + "`s value is not valid!!!");
            }
            catch (NumberFormatException ex) {
                System.out.println(beanName + "`s value is not a number at all!!!");
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
