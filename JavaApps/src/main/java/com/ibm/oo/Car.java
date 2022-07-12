package com.ibm.oo;

public class Car {
    //state
    int speed = 0;
    int gear = 0;

    //role of methods are to change the state variable
    void start() {
        //mutation changing
        speed = 5;
    }
    void changeGear(int gear) {
        this.gear = gear;
        switch (this.gear) {
            case 1:
                System.out.println("Pressing escalator ");
                speed = 10;
                break;
            case 2:
                System.out.println("Pressing escalator ");
                speed = 20;
                break;
            case 3:
                System.out.println("Pressing escalator ");
                speed = 30;
                break;
            case 4:
                System.out.println("Pressing escalator ");
                speed = 40;
                break;
            case 5:
                System.out.println("Pressing escalator ");
                speed = 60;
                break;
            default:
                System.out.println("Reverse ");
                speed = 10;
                break;

        }
    }
}
