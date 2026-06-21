package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, RESTful Web Service , by CSE B !";
    }

    @GetMapping("/add/{a}/{b}")
    public int addNumbers(@PathVariable int a, @PathVariable int b) {
        return a + b;
    }
}
