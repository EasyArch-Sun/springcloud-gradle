package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

//    @Autowired
//    private DemoConfig demoConfig;
//
    @GetMapping("demo")
    public String demo(){
        return "this is a consul provider";
    }
}
