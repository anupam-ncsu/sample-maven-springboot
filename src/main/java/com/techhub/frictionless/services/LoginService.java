package com.techhub.frictionless.services;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
    public boolean validateUser(final String userid, final String password) {
        // demo, demo
        return "demo".equalsIgnoreCase(userid) && "demo".equalsIgnoreCase(password);
    }
}