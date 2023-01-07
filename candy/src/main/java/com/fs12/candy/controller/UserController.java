package com.fs12.candy.controller;

import com.fs12.candy.model.User;
import com.fs12.candy.service.emplement.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
    private final UserServiceImpl userServiceImpl;

    @Autowired
    public UserController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }
    @GetMapping
    public List<User> getAllUsers() {
        return userServiceImpl.getAllUsers();
    }
    @GetMapping("/{id}")
    public Optional<User> findUserById(@PathVariable("id") Long id) {
        return userServiceImpl.findById(id);
    }
    @PostMapping
    public User saveUser(@RequestBody User user) {
        return userServiceImpl.saveUser(user);
    }
    @PutMapping
    public User updateUser(@RequestBody User user) {
        return  userServiceImpl.updateUser(user);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        userServiceImpl.deleteUser(id);
    }
}
