package com.ibm.isa.interfaces;

public class Flight implements Flyable {
    @Override
    public String fly() {
        return "Flight flies";
    }
}
