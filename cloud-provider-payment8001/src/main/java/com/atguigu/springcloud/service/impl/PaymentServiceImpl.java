package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDAO;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    PaymentDAO paymentDAO;

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDAO.selectByPrimaryKey(id);
    }

    @Override
    public int insert(Payment payment) {
        return paymentDAO.insert(payment);
    }
}
