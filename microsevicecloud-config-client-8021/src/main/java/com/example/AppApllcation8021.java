package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Hello world!
 */
@SpringBootApplication
@RestController
public class AppApllcation8021 {
    public static void main(String[] args) {
        SpringApplication.run(AppApllcation8021.class, args);
    }

    @Value("${foo}")
    private String foo;

    @GetMapping("/get")
    public String getfoo() {
        return foo;
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
