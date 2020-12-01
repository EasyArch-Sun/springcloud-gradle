package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value ="consul-provider",fallbackFactory = DemoServiceFallback.class)
public interface DemoService {

    @GetMapping("/demo")
    String consumer();
}

