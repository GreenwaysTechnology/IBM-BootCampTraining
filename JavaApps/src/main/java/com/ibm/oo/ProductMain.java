package com.ibm.oo;

public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(1);
        product.setProductName("Mobile");
        product.setQty(13);
        product.setPrice(23.76);
        System.out.println(product.getId());
        System.out.println(product.getProductName());
        System.out.println(product.getQty());
        System.out.println(product.getPrice());

        product = new Product(23, "Watch", 10, 298.87);
        System.out.println(product.getId());
        System.out.println(product.getProductName());
        System.out.println(product.getQty());
        System.out.println(product.getPrice());
    }
}
