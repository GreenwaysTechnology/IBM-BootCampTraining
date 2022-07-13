package com.ibm.di;

import java.util.List;

public class ProductController {
    //declare dependency
    private ProductService productService;

    public ProductController() {
    }

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public List<String> findProducts() {
        return productService.findAllProducts();
    }
}
