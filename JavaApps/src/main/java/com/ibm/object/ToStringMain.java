package com.ibm.object;

public class ToStringMain {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Subramanian", 1000.89);
        System.out.println(employee.toString());
        System.out.println(employee);

        //hashcode is unique integer value to identify the objects
        System.out.println(employee.hashCode());

    }
}
