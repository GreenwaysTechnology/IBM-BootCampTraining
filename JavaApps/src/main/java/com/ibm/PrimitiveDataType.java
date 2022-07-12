package com.ibm;

public class PrimitiveDataType {
    public static void main(String[] args) {
        //numbers
        byte b = 10;
        short s = 10;
        int a = 10; //type variable=value
        long lng = 100;
        //precision values
        float price = 10.5f;
        double stock = 90.89;
        //char
        char gender = 'M';
        //boolean
        boolean isValid = true;

        //java is strongly/static typed : type of variable is verified during compile time
        int j = 10;
        //j=10.78; //compiler verfies the type of j

        System.out.println("Byte b" + b);
        System.out.println("Short s" + s);
        System.out.println("Int a" + a);
        System.out.println("Long lng" + lng);
        System.out.println("Float price" + price);
        System.out.println("Double Stock " + stock);

        System.out.println("Char Gender " + gender);
        System.out.println("Boolean isValid  " + isValid);


    }
}
