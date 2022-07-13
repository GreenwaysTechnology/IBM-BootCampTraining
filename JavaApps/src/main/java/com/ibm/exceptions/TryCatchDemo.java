package com.ibm.exceptions;

import com.ibm.object.Employee;

public class TryCatchDemo {
    public static void main(String[] args) {
        //handling or reporting errors using try...catch
        //unchceked exception
        try{
            //application logic
            Employee employee =null;
            System.out.println(employee.getName());
        }
        catch (NullPointerException es){
            System.out.println(es.getMessage());
        }
    }
}
