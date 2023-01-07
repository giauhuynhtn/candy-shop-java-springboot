package com.fs12.candy.service.emplement;

import com.fs12.candy.model.Order_User;
import com.fs12.candy.repository.OrderUserRepository;
import com.fs12.candy.service.Order_UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Order_UserServiceImpl implements Order_UserService {

    private final OrderUserRepository orderUserRepository;

    public Order_UserServiceImpl(OrderUserRepository orderUserRepository) {
        this.orderUserRepository = orderUserRepository;
    }

    @Override
    public List<Order_User> getAllOrderUser() {
        return orderUserRepository.findAll();
    }

    @Override
    public Optional<Order_User> findById(Long id) {
        return orderUserRepository.findById(id);
    }

    @Override
    public Order_User saveOrderUser(Order_User order_user) {
        return orderUserRepository.save(order_user);
    }

    @Override
    public Order_User updateOrderUser(Order_User order_user) {
        return orderUserRepository.save(order_user);
    }

    @Override
    public void deleteOrderUser(Long id) {
        orderUserRepository.deleteById(id);
    }
}
