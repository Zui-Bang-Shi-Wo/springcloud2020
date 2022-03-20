package com.atguigu.springcloud.service;


import org.springframework.stereotype.Component;

/**
 * @author zzyy
 * @create 2020/3/6 23:19
 **/
@Component

public class PaymentHystrixServiceImpl implements PaymentHystrixService{


    @Override
    public String paymentInfo_OK(Integer id) {
        return "接口实现类服务降级Ok！";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "接口实现类服务降级TimeOut！";
    }
}


