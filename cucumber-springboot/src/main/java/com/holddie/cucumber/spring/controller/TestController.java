package com.holddie.cucumber.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HoldDie
 * @date 2019-05-22 18:02
 * @vsersion 1.0
 **/
@RestController
@RequestMapping(value = "h")
public class TestController {
    @GetMapping
    public String testHello() {
        return "hello 123";
    }
}
