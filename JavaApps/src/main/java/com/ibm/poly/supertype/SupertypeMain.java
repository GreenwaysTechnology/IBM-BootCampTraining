package com.ibm.poly.supertype;

public class SupertypeMain {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        System.out.println(tiger.eat());
        System.out.println(tiger.hunt());

        //program to super type
        Animal animal = new Tiger();
        System.out.println(animal.eat());
        //System.out.println(animal.hunt());
        //casting - down casting
        Tiger tmpTiger = (Tiger) animal;
        System.out.println(tmpTiger.hunt());
    }
}
