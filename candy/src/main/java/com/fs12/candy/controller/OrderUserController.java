package com.fs12.candy.controller;

import com.fs12.candy.model.Order_User;
import com.fs12.candy.service.emplement.Order_UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/order_user")
public class OrderUserController {
    private final Order_UserServiceImpl order_userServiceImpl;
    @Autowired
    public OrderUserController(Order_UserServiceImpl order_userServiceImpl) {
        this.order_userServiceImpl = order_userServiceImpl;
    }

    @GetMapping
    public List<Order_User> getAllOrderUsers() {
        return order_userServiceImpl.getAllOrderUser();
    }

    @GetMapping("/{id}")
    public Optional<Order_User> findOrderUserById(@PathVariable("id") Long id) {
        return order_userServiceImpl.findById(id);
    }

    @PostMapping
    public Order_User saveOrderUser(@RequestBody Order_User order_user) {
        return order_userServiceImpl.saveOrderUser(order_user);
    }

    @PutMapping
    public Order_User updateOrderUser(@RequestBody Order_User order_user) {
        return order_userServiceImpl.updateOrderUser(order_user);
    }

    @DeleteMapping("/{id}")
    public void deleteOrderUser(@PathVariable("id") Long id) {
        order_userServiceImpl.deleteOrderUser(id);
    }
 }
