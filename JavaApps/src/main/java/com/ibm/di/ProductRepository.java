package com.ibm.di;

import java.util.List;

public class ProductRepository {

    public List<String> findAll() {
        return List.of("Phone", "Tv", "Books");
    }
}
