package com.ibm.ds;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7, 9, 10};
        //iterate
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        //object array
        Employee[] employees = {
                new Employee(1, "A"),
                new Employee(2, "B")
        };
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
}
