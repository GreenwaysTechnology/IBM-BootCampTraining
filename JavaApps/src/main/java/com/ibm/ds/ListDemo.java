package com.ibm.ds;

import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {
        //ArrayList - without generics
        //ArrayList list = new ArrayList();
        ArrayList<Employee> list =new ArrayList<>();
        list.add(new Employee(1,"A"));
        list.add(new Employee(2,"B"));
        //list.add(new Customer(12));
        //print
//        for (Object obj:list) {
//            Employee employee = (Employee)obj;
//            System.out.println(employee.getId() + " " + employee.getName());
//        }
        for (Employee employee:list) {
            System.out.println(employee.getId() + " " + employee.getName());
        }


    }
}
