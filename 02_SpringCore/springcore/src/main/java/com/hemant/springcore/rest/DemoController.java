package com.hemant.springcore.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hemant.springcore.common.Coach;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class DemoController {
   
    // Defining private field for dependency
    private Coach myCoach;

   // private Coach anotherCoach;
    
    // Defining setter injection
    // @Autowired
    // public void setCoach(Coach theCoach){
    //     myCoach = theCoach;
    // }

    /*
   Behind the scene spring will do: 
   Coach theCoach = new CricketCoach();
   DemoController demoController = new DemoController();
   demoCOntroller.setCoach(theCoach);
    */


    // Defining a contructor for dependency injection.
    // Auto wired annotation tells spring to inject dependency. If you only have one constructor then @Autowired on constructor is optional.
    @Autowired   
    public DemoController(@Qualifier("aquatic") Coach theCoach){ // We can now replace swimCoach with aquatic bean id
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
    }
    
    // Default scope is singleton all dependency injections for bean will reference the same bean.
    // @Autowired
    // public DemoController(@Qualifier("cricketCoach") Coach theCoach, @Qualifier("cricketCoach") Coach theAnotherCoach){
    //     System.out.println("In constructor: " + getClass().getSimpleName());
    //     myCoach = theCoach;
    //     anotherCoach = theAnotherCoach;
    // }

    // Now checking the bean scope.

    // @GetMapping("/check")
    // public String check(){
    //     return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
    // }

    // We can also create the setter injection.@GetMapping("path")
    // public String getMethodName(@RequestParam String param) {
    //     return new String();
    // }
    /* 
    Spring Framework internally 
    Coach theCoach = new CricketCoach();
    DemoController demoController = new DemoCOntroller(theCoach);
    */
    
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
