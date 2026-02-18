package com.example.Ivan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 
@SpringBootApplication
public class IvanApplication {

    public static void main(String[] args) {
        SpringApplication.run(IvanApplication.class, args);
    }

    @RequestMapping("/")
    public String home() {
        return "Hello World! Spring Boot 4 está aquí.";
    }
}