package com.ibm.exceptions;

public class NumberFormat {
    public static void main(String[] args) {
        String no = "$10";
        //convert into Number
        int result = Integer.parseInt(no) * 100;
        System.out.println(result);
    }
}
