package com.ibm.di;


public class App {
    public static void main(String[] args) {

        //create dependencies object
        ProductRepository productRepository = new ProductRepository();
        ProductService productService = new ProductService(productRepository);
        //productService.setProductRepository(productRepository);
        ProductController productController = new ProductController(productService);

        productController.findProducts().stream().forEach(product -> {
            System.out.println(product);
        });

    }
}
