package com.ibm.isa.interfaces;

public class Bird implements Flyable {
    @Override
    public String fly() {
        return "Bird Flies";
    }
}
