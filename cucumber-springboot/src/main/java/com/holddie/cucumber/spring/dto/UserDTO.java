package com.holddie.cucumber.spring.dto;

import lombok.Data;

import javax.validation.constraints.Size;

/**
 * A DTO representing a user, with his authorities.
 */
@Data
public class UserDTO {


    @Size(max = 50)
    private String firstName;

    @Size(max = 50)
    private String lastName;


    public UserDTO(String username) {
        this.firstName = "firstName";
        this.lastName = "Administrator";
    }

}
