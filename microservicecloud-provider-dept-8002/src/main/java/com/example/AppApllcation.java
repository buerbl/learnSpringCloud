package com.example;

import com.example.entity.Dept;
import com.example.sercive.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
public class AppApllcation
{
    public static void main( String[] args ) {
         SpringApplication.run(AppApllcation.class, args);
    }

    @Autowired
    private IDeptService deptService;
    @RequestMapping
    public List<Dept> list(){
        return deptService.list();
    }
}
