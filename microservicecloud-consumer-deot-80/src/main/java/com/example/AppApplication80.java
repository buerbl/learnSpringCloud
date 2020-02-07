package com.example;

import com.example.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
public class AppApplication80
{
    public static void main( String[] args ) {
        SpringApplication.run(AppApplication80.class, args);
    }

    public static final String URL = "http://localhost:8002";

    @Autowired
    private RestTemplate restTemplatel;

    @GetMapping
    public String test(){
        return "80";
    }

    @GetMapping("/list")
    public List<Dept> list(){
        return restTemplatel.getForObject(URL, ArrayList.class);
    }
}
