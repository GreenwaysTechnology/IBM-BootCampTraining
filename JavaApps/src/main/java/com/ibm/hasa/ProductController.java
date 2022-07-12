package com.ibm.hasa;

public class ProductController {
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
}
