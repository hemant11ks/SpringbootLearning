package com.example.Springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // Inject properties fo first.name and last.name
    @Value("${first.name}")
    private String firstName;

    @Value("${last.name}")
    private String secondName;

    // expose end point to get full name
    @GetMapping("/fullname")
    public String getFullNameInfo(){
        return "First Name: " + firstName + ", Last Name: " + secondName ;
    }
    
    // expose "/" that return "Hello Word"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k";
    }

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is you lucky day.";
    }
}
