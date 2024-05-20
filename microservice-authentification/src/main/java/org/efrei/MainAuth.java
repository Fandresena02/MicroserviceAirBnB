package org.efrei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MainAuth {
    public static void main(String[] args) {
        SpringApplication.run(MainAuth.class, args);
    }

    @GetMapping("/hello4")
    public String sayHello() {
        return "Hello, World!";
    }
}