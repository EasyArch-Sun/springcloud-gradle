package com.example.demo.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class DemoServiceFallback implements FallbackFactory<DemoService> {
    @Override
    public DemoService create(Throwable cause) {
        return new DemoService() {
            @Override
            public String consumer() {
                return "调用失败，请稍候重试！";
            }
        };
    }
}
