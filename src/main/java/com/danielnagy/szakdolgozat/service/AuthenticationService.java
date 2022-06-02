package com.danielnagy.szakdolgozat.service;

import com.danielnagy.szakdolgozat.model.User;
import org.springframework.stereotype.Service;

@Service
public interface AuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
