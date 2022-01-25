package com.epam.spring.homework2.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        switch(beanName) {
            case "beanA" :
                BeanA beanA = (BeanA)bean;
                if (beanA.getName() == null)
                    System.out.println(beanName + "`s name is not valid!!!");
                try {
                    if (Integer.parseInt(beanA.getValue()) < 1)
                        System.out.println(beanName + "`s value is not valid!!!");
                }
                catch (NumberFormatException ex) {
                    System.out.println(beanName + "`s value is not a number at all!!!");
                }
                break;
            case "beanB" :
                BeanB beanB = (BeanB)bean;
                if (beanB.getName() == null)
                    System.out.println(beanName + "`s name is not valid!!!");
                try {
                    if (Integer.parseInt(beanB.getValue()) < 1)
                        System.out.println(beanName + "`s value is not valid!!!");
                }
                catch (NumberFormatException ex) {
                    System.out.println(beanName + "`s value is not a number at all!!!");
                }
                break;
            case "beanC" :
                BeanC beanC = (BeanC)bean;
                if (beanC.getName() == null)
                    System.out.println(beanName + "`s name is not valid!!!");
                try {
                    if (Integer.parseInt(beanC.getValue()) < 1)
                        System.out.println(beanName + "`s value is not valid!!!");
                }
                catch (NumberFormatException ex) {
                    System.out.println(beanName + "`s value is not a number at all!!!");
                }
                break;
            case "beanD" :
                BeanD beanD = (BeanD)bean;
                if (beanD.getName() == null)
                    System.out.println(beanName + "`s name is not valid!!!");
                try {
                    if (Integer.parseInt(beanD.getValue()) < 1)
                        System.out.println(beanName + "`s value is not valid!!!");
                }
                catch (NumberFormatException ex) {
                    System.out.println(beanName + "`s value is not a number at all!!!");
                }
                break;
            case "beanE" :
                BeanE beanE = (BeanE)bean;
                if (beanE.getName() == null)
                    System.out.println(beanName + "`s name is not valid!!!");
                try {
                    if (Integer.parseInt(beanE.getValue()) < 1)
                        System.out.println(beanName + "`s value is not valid!!!");
                }
                catch (NumberFormatException ex) {
                    System.out.println(beanName + "`s value is not a number at all!!!");
                }
                break;
            case "beanF" :
                BeanF beanF = (BeanF)bean;
                if (beanF.getName() == null)
                    System.out.println(beanName + "`s name is not valid!!!");
                try {
                    if (Integer.parseInt(beanF.getValue()) < 1)
                        System.out.println(beanName + "`s value is not valid!!!");
                }
                catch (NumberFormatException ex) {
                    System.out.println(beanName + "`s value is not a number at all!!!");
                }
                break;
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
