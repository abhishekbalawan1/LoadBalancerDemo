package com.example.PersonAddress.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/address")
public class PersonController {

    @GetMapping("/hello")
    public List<String> sayHello(){
        List<String> list = new LinkedList<String>();
        list.add("Hello");
        list.add("from");
        list.add("address");
        list.add("repository");
        return list;
    }

}
