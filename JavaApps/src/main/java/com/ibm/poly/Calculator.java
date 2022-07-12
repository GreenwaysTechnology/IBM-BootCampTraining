package com.ibm.poly;

public class Calculator {

    private int x;
    private int y;
    private int z;

    //constructor overloading : having many constructors with different set of args

    public Calculator() {
    }

    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Calculator(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //req : sum
    //without overloading
    public int addTwoNum(int a, int b) {
        return a + b;
    }

    public int addThreeNum(int a, int b, int c) {
        return a + b + c;
    }

    //with overloaing
    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }
}
