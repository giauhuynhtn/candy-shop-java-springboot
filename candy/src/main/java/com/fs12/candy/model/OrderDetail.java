package com.fs12.candy.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="order_detail")
@Data
@NoArgsConstructor
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_detail_id")
    private Long id;



    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    private Product product;

    @Column(name="quantity")
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "order_id", insertable = false, updatable = false)
    private Order_User order_user;

    public OrderDetail(Product product, Integer quantity, Order_User order_user) {
        this.product = product;
        this.quantity = quantity;
        this.order_user = order_user;
    }
}
