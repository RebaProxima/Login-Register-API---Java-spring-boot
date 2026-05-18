package com.reba.authapi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class RegisterRequest {

    @NotBlank
    private String fullName;

    @Email
    @NotBlank
    private String email;

    @Size(min = 8)
    private String password;

    public String getFullName() {
        return fullName;
    }

     public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}