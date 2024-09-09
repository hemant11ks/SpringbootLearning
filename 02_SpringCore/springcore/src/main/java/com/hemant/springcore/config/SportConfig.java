package com.hemant.springcore.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hemant.springcore.common.SwimCoach;
import com.hemant.springcore.common.Coach;

@Configuration
public class SportConfig {

   // @Bean // Bean id defaults to method name
   // We can also give the bean id
   @Bean("aquatic")
    public Coach swimCoach(){
          return new SwimCoach();
    }

}
