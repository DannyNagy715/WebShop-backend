package com.danielnagy.szakdolgozat.service;

import com.danielnagy.szakdolgozat.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User saveUser (User user);

    void deleteUser(Long id);

    Optional<User> findUserByEmail(String email);

    Optional<User> findUserByUsername(String username);

    List<User> findAllUsers();
}
