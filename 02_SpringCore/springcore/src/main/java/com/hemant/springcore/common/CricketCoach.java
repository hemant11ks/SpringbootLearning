package com.hemant.springcore.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

// @Primary -> work as  Qualifier
@Component // Componenet annotation mark the class as String bean indicates available for dependency inject
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // Prototype scope : new object instance for each injection
public class CricketCoach implements Coach{
     
    public CricketCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
       }

    // Defining our init and destroy method
    // Init
    // @PostConstruct
    // public void doMyStartupStuff(){
    //     System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName());
    // }
    // // Deinit
    // @PreDestroy
    // public void doMyCleanUpStuff(){
    //     System.out.println("In doMyCleanupStuff(): " + getClass().getSimpleName());
    // }   

    @Override 
    public String getDailyWorkout() {
        return "Practice fast bowling for 1hr. ";
    }


}
