package com.example;

import com.example.entity.Dept;
import com.example.sercive.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
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
public class AppApllcation8002
{
    public static void main( String[] args ) {
         SpringApplication.run(AppApllcation8002.class, args);
    }

    @Autowired
    private IDeptService deptService;
    @GetMapping
    public List<Dept> list(){
        return deptService.list();
    }
}
