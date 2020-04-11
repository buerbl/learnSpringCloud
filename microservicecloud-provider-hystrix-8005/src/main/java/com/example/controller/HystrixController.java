package com.example.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 布尔bl
 * @create 2020/4/7 23:00
 */
@RestController
public class HystrixController {

    @GetMapping("/hystrix1")
    @HystrixCommand(fallbackMethod = "fallback")
    public String hystrix() {
        int i = 1 / 0;
        return "hystrix";
    }

    public String fallback() {
        return "出错了";
    }

}
