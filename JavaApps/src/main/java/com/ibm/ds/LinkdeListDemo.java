package com.ibm.ds;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class LinkdeListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hello");
        arrayList.add("hai");
        arrayList.add("greet");
        arrayList.add("welcome");
        for (String item : arrayList) {
            System.out.println(item);
        }
        System.out.println("..............");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("hello");
        linkedList.addFirst("welcome");
        for (String item : linkedList) {
            System.out.println(item);
        }
        //stack : L
        Stack<Integer> integers = new Stack<>();
        integers.push(1);
        integers.push(3);
        integers.push(2); // l
        int vale = integers.pop(); // last value in the stack will be read
        System.out.println(vale);

    }
}
