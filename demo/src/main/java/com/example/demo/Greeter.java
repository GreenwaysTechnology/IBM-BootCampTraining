package com.example.demo;


import org.springframework.stereotype.Component;

@Component
public class Greeter {
    public String sayGreet() {
        return "Hello Spring!";
    }
}
