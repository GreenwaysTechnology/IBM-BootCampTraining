package com.ibm.fp;

public class FpImplmentation {
    public static void main(String[] args) {
        Greeter greeter = null;
        //using implementation
        greeter = new GreeterImpl();
        greeter.greet();
        //inner classes
        greeter = new Greeter() {
            @Override
            public void greet() {
                System.out.println("Greet");
            }
        };
        greeter.greet();
        //functional way : lambda synatx
        greeter = () -> {
            System.out.println("Greet");
        };
        greeter.greet();
        greeter = () -> System.out.println("Greet");
        greeter.greet();

    }
}
