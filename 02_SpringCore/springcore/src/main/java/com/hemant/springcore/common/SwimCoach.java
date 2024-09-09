package com.hemant.springcore.common;
// We are not using @Component here on purpose
public class SwimCoach implements Coach {
    
    public SwimCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout(){
        return "Swim 1km as daily warmup";
    }

}
