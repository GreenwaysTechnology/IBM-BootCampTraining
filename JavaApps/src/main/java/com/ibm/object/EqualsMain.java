package com.ibm.object;

public class EqualsMain {
    public static void main(String[] args) {
        //equal  == operators
        int x = 10;
        int y = 10;
        boolean isEqual = x == y;
        System.out.println(isEqual ? "Both numbers are Equal" : "Both numbers are not Equal");
        Employee employee1 = new Employee(1, "Ram", 1000);
        Employee employee2 = new Employee(2, "Karthik", 2999);
        //here we are not validating contents are equal rather we refer employee1 variable and
        //employee2 point same object or not.
        boolean isSame = employee1 == employee2;
        System.out.println(isSame);
        //here employee3 and employee1 points the same object
        Employee employee3 = employee1;
        isSame = employee1 == employee3;
        System.out.println(isSame);
        //content based equal testing
        Employee employee4 = new Employee(1, "Ram", 1000);
        Employee employee5 = new Employee(2, "Ram", 1000);
        //using equals method
        System.out.println(employee4.equals(employee5) ? "Both employee are equal" : "Both employee not equal");


    }
}
