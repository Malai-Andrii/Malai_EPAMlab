package com.epam.spring.homework1.other;

import com.epam.spring.homework1.beans.BeanC;
import org.springframework.stereotype.Component;

@Component
public class OtherBeanC {
    private BeanC beanC;

    public OtherBeanC() {
        System.out.println(beanC);
    }
}
