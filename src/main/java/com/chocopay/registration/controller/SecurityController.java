package com.chocopay.registration.controller;

import com.chocopay.registration.service.user.UserMangerService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @Autowired
    private UserMangerService userMangerService;

    @PostMapping("/login")
    public String getToken(@RequestParam("username") final String username, @RequestParam("password") final String password){
        String token= userMangerService.login(username,password);
        if(StringUtils.isEmpty(token)){
            return "no token found";
        }
        return token;
    }
}
