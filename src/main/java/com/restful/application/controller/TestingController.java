package com.restful.application.controller;

import com.restful.application.dao.Users;
import com.restful.application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestingController {
    @Autowired
    UserRepository userRepository;
    @GetMapping("/username")
    public String getUsername() {
        // this is where username is stored in case of Keycloak //JwtAuthenticationToken principal
//		String username = principal.getTokenAttributes().get("preferred_username").toString();

        // because of configured JwtAuthenticationConverter we can get proper username with:
        //String username = principal.getName();

        // or with SecurityContextHolder:
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }

    @GetMapping("/usersList")
    public List<Users> getUsersList(){
        return userRepository.findAll();
    }
}
