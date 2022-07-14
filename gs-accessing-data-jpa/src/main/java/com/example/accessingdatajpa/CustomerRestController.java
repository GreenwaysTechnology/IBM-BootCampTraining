package com.example.accessingdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerRestController {

    @Autowired
    private CustomerRepository repository;

    @GetMapping("/customers/list")
    public Iterable<Customer> findAll() {
        return repository.findAll();
    }
}
