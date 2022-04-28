package com.danielnagy.szakdolgozat.controller;

import com.danielnagy.szakdolgozat.model.User;
import com.danielnagy.szakdolgozat.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<?> saveUser(@RequestBody User user) {
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("{email}")
    public ResponseEntity<?> findUserByEmail(@PathVariable String email) {
        return new ResponseEntity<>(userService.findUserByEmail(email), HttpStatus.OK);
    }

    @GetMapping({"{username}"})
    public ResponseEntity<?> findUserByUsername(@PathVariable String username) {
        return new ResponseEntity<>(userService.findUserByUsername(username), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> findUsers() {
        return new ResponseEntity<>(userService.findAllUsers(), HttpStatus.OK);
    }
}
