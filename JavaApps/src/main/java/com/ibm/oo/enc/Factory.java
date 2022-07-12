package com.ibm.oo.enc;

public class Factory {
    private Factory(){

    }
    public String getInfo(){
        return "Hello";
    }
    //to create instance , use static method:
    //static methods are accessiable without object, using class Name
    public static Factory getInstance(){
        return new Factory();
    }
}
