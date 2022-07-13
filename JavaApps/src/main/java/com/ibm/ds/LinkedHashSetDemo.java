package com.ibm.ds;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<Integer> integerSet = new LinkedHashSet<>();
        integerSet.add(12);
        integerSet.add(12);
        integerSet.add(100);
        integerSet.add(1);
        for (Integer ins : integerSet) {
            System.out.println(ins);
        }
    }
}
