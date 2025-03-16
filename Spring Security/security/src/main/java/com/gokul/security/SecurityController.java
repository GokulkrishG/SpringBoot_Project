package com.gokul.security;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
    @RequestMapping("/")
    public String greet(){
        return "Welcome Gokul";
    }
}
