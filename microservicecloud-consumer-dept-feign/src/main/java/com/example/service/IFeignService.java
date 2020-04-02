package com.example.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author 布尔bl
 * @create 2020/4/2 22:07
 */
@FeignClient(value = "microservicloud-dept") // 服务提供者的名字
public interface IFeignService {
    @GetMapping("/provide")
    String feign();
}
