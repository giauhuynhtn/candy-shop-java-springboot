package com.fs12.candy.controller;

import com.fs12.candy.model.OrderDetail;
import com.fs12.candy.service.emplement.OrderDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/order_detail")
public class OrderDetailController {
    private final OrderDetailServiceImpl orderDetailServiceImpl;

    @Autowired
    public OrderDetailController(OrderDetailServiceImpl orderDetailServiceImpl) {
        this.orderDetailServiceImpl = orderDetailServiceImpl;
    }

    @GetMapping
    public List<OrderDetail> getAllOrderDetails() {
        return orderDetailServiceImpl.getAllOrderDetail();
    }

    @GetMapping("/{id}")
    public Optional<OrderDetail> findOrderDetailById(@PathVariable("id") Long id) {
        return orderDetailServiceImpl.findById(id);
    }

    @PostMapping
    public OrderDetail saveOrderDetail(OrderDetail orderDetail) {
        return orderDetailServiceImpl.saveOrderDetail(orderDetail);
    }

    @PutMapping
    public OrderDetail updateOrderDetail(OrderDetail orderDetail) {
        return orderDetailServiceImpl.updateOrderDetail(orderDetail);
    }

    @DeleteMapping("/{id}")
    public void deleteOrderDetail(@PathVariable("id") Long id) {
        orderDetailServiceImpl.deleteOrderDetail(id);
    }


}
