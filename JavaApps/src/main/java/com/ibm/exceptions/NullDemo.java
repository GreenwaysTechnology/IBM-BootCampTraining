package com.ibm.exceptions;

import com.ibm.object.Employee;

public class NullDemo {
    public static void main(String[] args) {
        //null is value which identicates that the reference variable has not pointed object location
        Employee employee = null;
        // System.out.println(employee.getId());
        employee = new Employee();
        System.out.println(employee.getId());


    }
}
