package com.ibm.oo;

public class ObjectCreationMain {
    public static void main(String[] args) {
        //Create Object
        //employee is variable which type is Employee so this variable called reference variable
        //Employee is type which is Reference type
        //new is memory allocation operator
        //Employee() is constructor call , which initiates to allocate memory
        Employee employee = new Employee();
        System.out.println(employee.id);
        System.out.println(employee.name);
        System.out.println(employee.city);
        System.out.println(employee.salary);
        System.out.println(employee.status);
    }
}
