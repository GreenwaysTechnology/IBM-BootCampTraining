package com.ibm;

public class Loops {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println("Count is: " + i);
        }

        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }
        //do...while
        int counter = 1;
        do {
            System.out.println("Count is: " + counter);
            counter++;
        } while (counter < 11);
    }
}
