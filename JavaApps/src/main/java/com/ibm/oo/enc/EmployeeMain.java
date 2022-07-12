package com.ibm.oo.enc;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        //employee.id;
//        System.out.println(employee.generatePassword());
        System.out.println(employee.auth());
//        Factory factory = new Factory();
        //
        //static methods are accessed with help of Class name
        Factory factory = Factory.getInstance();
        System.out.println(factory.getInfo());

    }
}
