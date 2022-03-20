package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * PaymentDAO继承基类
 */
@Mapper
public interface PaymentDAO extends MyBatisBaseDao<Payment, Long> {
}