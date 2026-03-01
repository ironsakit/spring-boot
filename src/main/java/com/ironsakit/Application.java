package com.ironsakit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController  // New annotation (it's telling to SpringBoot that "Application" is not a generic Java Class, but is going to receive Internet requests
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    // New method within RestController
    @GetMapping  // When you open "localhost:8080" Spring Boot will call this function
    public String helloWorld(){  // Rest Endpoint
        return "Hello World Spring Boot";
    }
}
