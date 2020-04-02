package com.example;

import com.example.entity.Dept;
import com.example.service.DeptClientService;
import com.example.service.IFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.example"})
public class AppApplication80 {
    public static void main( String[] args ) {
        SpringApplication.run(AppApplication80.class, args);
    }

    @Autowired
    private DeptClientService  deptClientService;
    @GetMapping("/feign/list")
    public List<Dept> list(){
        return deptClientService.list();
    }

    @Autowired
    private IFeignService feignService;
    @GetMapping("/controller/feign")
    public String feign(){
        return feignService.feign();
    }

}
