package com.gokul.security.service;

import com.gokul.security.model.Users;
import com.gokul.security.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo repo;

    public Users register(Users users){
        return repo.save(users);
    }
}
