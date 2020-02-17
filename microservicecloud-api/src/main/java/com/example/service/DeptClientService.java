package com.example.service;

import com.example.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2020/2/17 16:13
 */
@FeignClient(value = "microservicloud-dept")
public interface DeptClientService {
    @GetMapping("/list")
    public List<Dept> list();
}



