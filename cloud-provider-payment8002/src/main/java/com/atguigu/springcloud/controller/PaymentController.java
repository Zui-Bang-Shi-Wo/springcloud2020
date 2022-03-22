package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.dao.PaymentDAO;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    PaymentService paymentService;
    @Resource
    PaymentDAO paymentDAO;
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("根据Id查询成功！====>"+payment);
        if (payment!=null){
            return new CommonResult(200,"成功!端口号为->"+serverPort,payment);
        }else {
            return new CommonResult(444,"失败！");
        }
    }

    @PostMapping("/payment/insert")
    public CommonResult insertPayment(@RequestBody Payment payment){
        int count = paymentService.insert(payment);
        log.info("插入数据条数======>"+count);
        if (count>0){
            return new CommonResult(200,"成功!端口号为->"+serverPort);
        }else {
            return new CommonResult(444,"失败！");
        }
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }

    @GetMapping("/payment/zipkin")
    public String paymentZipkin() {
        return "hi ,i'am paymentzipkin server fall back，welcome to here, O(∩_∩)O哈哈~";
    }
}
