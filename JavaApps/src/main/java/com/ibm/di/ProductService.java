package com.ibm.di;

import java.util.List;

public class ProductService {
    private ProductRepository productRepository;

    public ProductService() {
    }

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductRepository getProductRepository() {
        return productRepository;
    }

    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    //service mehtod
    public List<String> findAllProducts(){
        //get from repository
        return  productRepository.findAll();
    }
}
