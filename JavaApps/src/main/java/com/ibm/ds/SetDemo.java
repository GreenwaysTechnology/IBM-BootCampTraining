package com.ibm.ds;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(12);
        integerSet.add(12);
        integerSet.add(100);
        integerSet.add(1);
        for (Integer ins : integerSet) {
            System.out.println(ins);
        }
        Set<Employee> employeeHashSet = new HashSet<>();
        employeeHashSet.add(new Employee(1, "A1"));
        employeeHashSet.add(new Employee(3, "A3"));
        employeeHashSet.add(new Employee(3, "A3"));
        employeeHashSet.add(new Employee(2, "A2"));
        employeeHashSet.add(new Employee(5, "A5"));
        employeeHashSet.add(new Employee(5, "A5"));

        for (Employee employee : employeeHashSet) {
            System.out.println(employee);
        }
    }
}
