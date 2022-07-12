package com.ibm.isa.abscls;

public class AbstractMain {
    public static void main(String[] args) {
        Animal animal =new Cat();
        animal.saveAnimals();
        animal.eat();
        Cat tmpCat = (Cat)animal;
        tmpCat.memow();
        animal =new Dog();
        animal.saveAnimals();
        animal.eat();
    }
}
