package com.holddie.cucumber.spring.controller;

import com.holddie.cucumber.spring.dto.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HoldDie
 * @date 2019-05-23 19:56
 * @vsersion 1.0
 **/
@RestController
@RequestMapping(value = "/api")
public class UserResource {

    @GetMapping(value = "/users/{userId}")
    public UserDTO getUserDTO(@PathVariable(value = "userId") String username) {
        return new UserDTO(username);
    }

}
