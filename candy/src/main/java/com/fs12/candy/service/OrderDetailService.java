package com.fs12.candy.service;

import com.fs12.candy.model.OrderDetail;

import java.util.List;
import java.util.Optional;

public interface OrderDetailService {
    List<OrderDetail> getAllOrderDetail();
    Optional<OrderDetail> findById(Long id);
    OrderDetail saveOrderDetail(OrderDetail orderDetail);
    OrderDetail updateOrderDetail(OrderDetail orderDetail);
    void deleteOrderDetail(Long id);
}
