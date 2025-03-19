package com.gokul.security;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
    @RequestMapping("/")
    public String greet(HttpServletRequest request){
        return "Welcome Gokul"+ request.getSession().getId();
    }
}
