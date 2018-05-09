package com.example.usersapi.controllers;

import com.example.usersapi.models.Users;
import com.example.usersapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UsersController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public Iterable<Users> findAllUsers() {
        return userRepository.findAll();
    }

//    @GetMapping("/users/{userId}")
//    public Optional<Users> findUserById(@PathVariable Long userId) {
//        return userRepository.findById(userId);
//    }

//    @DeleteMapping("/users/{userId}")
//    public HttpStatus deleteUserById(@PathVariable Long userId) {
//        userRepository.deleteById(userId);
//        return HttpStatus.OK;
//    }

    @PostMapping("/users")
    public Users createNewUser(@RequestBody Users newUser) {
        return userRepository.save(newUser);
    }

//    @PatchMapping("/users/{userId}")
//    public Users updateUserById(@PathVariable Long userId, @RequestBody Users userRequest) {
//
//        Users userFromDb = userRepository.findById(userId).get();
//
//        userFromDb.setUserName(userRequest.getUserName());
//        userFromDb.setFirstName(userRequest.getFirstName());
//        userFromDb.setLastName(userRequest.getLastName());
//
//        return userRepository.save(userFromDb);
//    }
}