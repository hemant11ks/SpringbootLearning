package com.hemant.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    
   public BaseballCoach(){
    System.out.println("In constructor: " + getClass().getSimpleName());
   }

    @Override
    public String getDailyWorkout() {
        return "Daily practice baseball session for a hour....";
    }
}
