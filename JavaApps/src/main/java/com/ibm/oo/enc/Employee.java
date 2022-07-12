package com.ibm.oo.enc;

public class Employee {
    //instance variables
    private int id;

    //private methods
    private String generatePassword(){
        return "Abc";
    }
    public String auth(){
        return generatePassword();
    }
}
