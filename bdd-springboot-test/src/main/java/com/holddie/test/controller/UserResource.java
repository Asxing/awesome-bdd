package com.holddie.test.controller;

import com.holddie.test.service.dto.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/api")
public class UserResource {

    @GetMapping("/users/{login}")
    public UserDTO getUser(@PathVariable String login) {
        log.debug("REST request to get User : {}", login);
        return new UserDTO(login);
    }

}
