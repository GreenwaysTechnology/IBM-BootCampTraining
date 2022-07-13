package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductRepository {

    public List<String> findAll(){
        return List.of("Java","Spring","Boot");
    }
}
