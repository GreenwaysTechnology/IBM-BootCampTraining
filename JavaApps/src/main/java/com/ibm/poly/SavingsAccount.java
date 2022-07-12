package com.ibm.poly;

public class SavingsAccount extends  Account{
    //overriding
    public double deposit(double amount) {
        System.out.println("Savings Account");
        return amount * 10;
    }
}
