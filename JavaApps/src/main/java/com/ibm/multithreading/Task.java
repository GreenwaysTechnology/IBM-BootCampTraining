package com.ibm.multithreading;

public class Task implements Runnable {
    @Override
    public void run() {
        //going to have thread logic
        System.out.println(Thread.currentThread().getName());

    }
}
