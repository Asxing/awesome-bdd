package com.holddie.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BddSpringbootTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(BddSpringbootTestApplication.class, args);
    }
    
    @GetMapping("/")
    public String helloWorld() {
        return "hello world";
    }
}
