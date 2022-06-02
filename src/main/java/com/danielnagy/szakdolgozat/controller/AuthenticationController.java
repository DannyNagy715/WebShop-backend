package com.danielnagy.szakdolgozat.controller;

import com.danielnagy.szakdolgozat.model.User;
import com.danielnagy.szakdolgozat.service.AuthenticationService;
import com.danielnagy.szakdolgozat.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/auth")
public class AuthenticationController {

    private final Log log = LogFactory.getLog(this.getClass());

    private final AuthenticationService authenticationService;
    private final UserService userService;

    public AuthenticationController(AuthenticationService authenticationService, UserService userService) {
        this.authenticationService = authenticationService;
        this.userService = userService;
    }

    @PostMapping("register")
    public ResponseEntity<?> signUp(@RequestBody User user){
        if (userService.findUserByUsername(user.getUsername()).isPresent()){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        log.info("User created: " + user.getUsername() + " email: " + user.getEmail());
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }

    @PostMapping("sign-in")
    public ResponseEntity<?> signIn(@RequestBody User user){
        log.info("User login: " + user.getUsername() + " email: " + user.getEmail() + "token" + user.getToken());
        return new ResponseEntity<>(authenticationService.signInAndReturnJWT(user), HttpStatus.OK);
    }
}
