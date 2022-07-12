package com.ibm.isa.abscls;

abstract public class Animal {
    //abstract methods
    abstract void eat();

    //non abstract methods
    void saveAnimals() {
        System.out.println("Save Animals from the hunting");
    }
}
