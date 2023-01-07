package com.fs12.candy.service;

import com.fs12.candy.model.Order_User;

import java.util.List;
import java.util.Optional;

public interface Order_UserService {
    List<Order_User> getAllOrderUser();
    Optional<Order_User> findById(Long id);
    Order_User saveOrderUser(Order_User order_user);
    Order_User updateOrderUser(Order_User order_user);
    void deleteOrderUser(Long id);
}
