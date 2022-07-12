package com.ibm.isa.abscls;

public class Cat extends Animal{
    @Override
    void eat() {
        System.out.println("Cat eats");
    }
    void memow(){
        System.out.println("memow");
    }
}
