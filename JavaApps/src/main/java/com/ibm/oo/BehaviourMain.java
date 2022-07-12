package com.ibm.oo;

public class BehaviourMain {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Inital Speed " + car.speed);
        //method call
        car.start();
        System.out.println("After Engine Start Speed is " + car.speed);
        //
        car.changeGear(1);
        System.out.println("After Changing Gear, Speed is  " + car.speed);
        car.changeGear(2);
        System.out.println("After Changing Gear, Speed is  " + car.speed);

    }
}
