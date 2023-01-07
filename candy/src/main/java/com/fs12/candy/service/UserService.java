package com.fs12.candy.service;

import com.fs12.candy.model.Product;
import com.fs12.candy.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();
    Optional<User> findById(Long id);
    User saveUser(User user);
    User updateUser(User user);
    void deleteUser(Long id);

}
