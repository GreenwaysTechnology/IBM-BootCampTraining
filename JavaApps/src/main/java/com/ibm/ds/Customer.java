package com.ibm.ds;

public class Customer {
    public Customer(int customerId) {
        this.customerId = customerId;
    }

    private int customerId;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
