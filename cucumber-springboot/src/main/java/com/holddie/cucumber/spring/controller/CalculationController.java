package com.holddie.cucumber.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calc")
public class CalculationController {

    @GetMapping("/add/{num1}/{num2}")
    public Integer add(@PathVariable int num1, @PathVariable int num2) {
        return num1 + num2;
    }

    @GetMapping("/sub/{num1}/{num2}")
    public Integer subtract(@PathVariable int num1, @PathVariable int num2) {
        return num1 - num2;
    }

    @GetMapping("/multiply/{num1}/{num2}")
    public Integer multiple(@PathVariable int num1, @PathVariable int num2) {
        return num1 * num2;
    }

    @GetMapping("/divide/{num1}/{num2}")
    public Integer divide(@PathVariable int num1, @PathVariable int num2) {
        return num1 / num2;
    }
}
