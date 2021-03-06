package com.atguigu.springcloud.lab;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class MyLab implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);


    private final int getAndINcrement() {
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0 : current + 1;
        } while (!this.atomicInteger.compareAndSet(current, next));
        return next;
    }


    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        return serviceInstances.get(getAndINcrement() % serviceInstances.size());
    }
}
