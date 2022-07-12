package com.ibm.oo;

public class Product {
    //state declaration according to coding standard
    private int id;

    private String productName;
    private double qty;
    private double price;

    public Product() {
    }

    public Product(int id, String productName, double qty, double price) {
        this.id = id;
        this.productName = productName;
        this.qty = qty;
        this.price = price;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }




    //setter : write - init
    public void setId(int id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    //getter : read
    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }
}
