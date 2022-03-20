package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

public interface PaymentService {

    Payment getPaymentById(Long id);

    int insert(Payment payment);
}
