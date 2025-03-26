package com.gokul.security.service;

import com.gokul.security.model.Users;
import com.gokul.security.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    public BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);


    public Users register(Users users) {
        users.setPassword(encoder.encode(users.getPassword()));
        return repo.save(users);
    }

}
