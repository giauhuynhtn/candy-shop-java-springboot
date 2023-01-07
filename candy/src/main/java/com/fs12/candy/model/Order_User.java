package com.fs12.candy.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="order_user")
@Data
@NoArgsConstructor
public class Order_User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_id")
    private Long id;

    @Column(name="user_id")
    private Integer userId;

//    @Column(name = "user_info")
    @ManyToOne   //many orders to one user
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user;

    @OneToMany
    @JoinColumn(name = "order_id")
    @JsonIgnore
    private Set<OrderDetail> orderDetailSet;

    @Column(name = "order-status")
    private OrderStatus orderStatus;

    public Order_User(Integer userId, User user, OrderStatus orderStatus) {
        this.userId = userId;
        this.user = user;
        this.orderStatus = orderStatus;
    }
}
