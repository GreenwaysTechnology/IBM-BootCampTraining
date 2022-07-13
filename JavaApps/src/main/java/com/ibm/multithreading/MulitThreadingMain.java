package com.ibm.multithreading;

public class MulitThreadingMain {
    public static void main(String[] args) {
        //To know on which thread this current code is running
        System.out.println("Main method is Running on => " + Thread.currentThread().getName());

        //create new Thread
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Task());
            thread.setName("Task-Thread-" + i);
            //start thread
            try {
                Thread.sleep(1000); //pause current thread for 1 sec
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            thread.start();
        }
    }
}
