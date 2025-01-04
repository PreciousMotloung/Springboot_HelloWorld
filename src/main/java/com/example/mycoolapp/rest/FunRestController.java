package com.example.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //expose "/" that return hello world
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/workout")
    public String getDailyWorkout()
    {
        return "Run a hard disk";
    }

    @GetMapping("/routine")
    public String getRoutine()

    {
        return "Daily routine";
    }
}
