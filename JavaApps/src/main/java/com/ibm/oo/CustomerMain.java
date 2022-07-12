package com.ibm.oo;

public class CustomerMain {
    public static void main(String[] args) {
        //Customer - calling constructor without arg
        Customer customer = new Customer();
        System.out.println(customer.id +" " + customer.name);
        //initialize the state after object creation
        customer.id =100;
        customer.name="Subramanian";
        System.out.println(customer.id +" " + customer.name);

        //creating instance with new constructor
        Customer customer1 = new Customer(13,"Ram");
        System.out.println(customer1.id +" " + customer1.name);



    }
}
