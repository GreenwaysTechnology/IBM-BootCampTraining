package com.ibm.isa.interfaces;

public class InterfaceMain {
    public static void main(String[] args) {
        Flyable flyable = new Flight();
        System.out.println(flyable.fly());
        //
        flyable = new Bird();
        System.out.println(flyable.fly());
    }
}
