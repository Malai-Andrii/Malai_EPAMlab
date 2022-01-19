package com.epam.spring.homework1.config;

import com.epam.spring.homework1.beans.BeanA;
import com.epam.spring.homework1.pet.Cat;
import com.epam.spring.homework1.pet.Cheetah;
import com.epam.spring.homework1.pet.Dog;
import com.epam.spring.homework1.pet.Pet;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@Import({Pet.class, Cat.class, Dog.class, Cheetah.class})
public class PetConfig {
    @Bean
    @Primary
    public Cheetah getCheetah1() {return new Cheetah();}

    @Bean
    @Qualifier("Cheetah")
    public Cheetah getCheetah2() {return new Cheetah();}
}
