package com.ibm.poly;

public class OverloadingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.addTwoNum(13, 45));
        System.out.println(calculator.addThreeNum(12, 3, 4));
        System.out.println(calculator.sum(11, 100));
        System.out.println(calculator.sum(34, 90, 90));
        calculator = new Calculator(23, 90);
        calculator = new Calculator(78, 9, 0);
    }
}
