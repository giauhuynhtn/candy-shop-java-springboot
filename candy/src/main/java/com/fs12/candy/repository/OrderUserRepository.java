package com.fs12.candy.repository;

import com.fs12.candy.model.Order_User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderUserRepository extends JpaRepository<Order_User, Long> {
}
