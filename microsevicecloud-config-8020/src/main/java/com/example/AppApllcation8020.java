package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableConfigServer
public class AppApllcation8020 {
    public static void main( String[] args ) {
         SpringApplication.run(AppApllcation8020.class, args);
    }

}
