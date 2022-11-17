package com.example.PersonJob.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/job")
public class ControllerJob {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from job repository";
    }
}
