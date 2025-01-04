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

    //Inject property for coach name and team name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    //expose new endpoint for "teaminfo"
    @GetMapping("/teaminfo")
    private String teamInfo() {
        return"Team name: " +teamName + " " +"coach name: "+ coachName;
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
