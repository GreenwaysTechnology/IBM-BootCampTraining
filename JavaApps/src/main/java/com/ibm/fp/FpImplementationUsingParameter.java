package com.ibm.fp;

//lambda interface
@FunctionalInterface
interface Welcome {
    void sayWelcome(String name);
}


public class FpImplementationUsingParameter {
    public static void main(String[] args) {
        Welcome welcome = null;
        welcome = (String name) -> System.out.println(name);
        welcome.sayWelcome("Subramanian");
        //Type inference
        welcome = name -> System.out.println(name);
        welcome.sayWelcome("Subramanian");
    }
}
