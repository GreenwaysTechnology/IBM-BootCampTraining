package com.ibm.fp;

import java.util.ArrayList;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 89, 90);
        //
        list.stream().filter(i -> i % 2 != 0).forEach(j -> {
            System.out.println(j);
        });
    }
}
