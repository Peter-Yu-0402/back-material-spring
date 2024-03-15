package org.sparta.backmaterialspring.payment.entities;

import jakarta.persistence.*;
import org.sparta.backmaterialspring.common.entity.BaseEntity;

@Entity
public class ShippingInfo extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(mappedBy = "shippingInfo")
    private Order order;

    @Column(length = 1000)
    private String address;

    @Column(length = 50)
    private String status;

    @Column(length = 100, nullable = true)
    private String trackingNumber;

    @Column(length = 50, nullable = true)
    private String shippingCompany;
}