package com.amx.keycloak.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping(path = "/amx-userdetail")
public class UserController {

    @RolesAllowed("user")
    @GetMapping(path = "/getuser", produces = "application/json")
    public String getUserDetails() {
        return "User1";
    }
}
