package com.ibm.ds;

import java.util.Set;
import java.util.TreeSet;

public class TreesetDemo {
    public static void main(String[] args) {
        Set<Integer> integerSet = new TreeSet<>();
        integerSet.add(12);
        integerSet.add(12);
        integerSet.add(100);
        integerSet.add(1);
        for (Integer ins : integerSet) {
            System.out.println(ins);
        }
    }
}
