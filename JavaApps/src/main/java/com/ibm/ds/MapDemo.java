package com.ibm.ds;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        //
        Map<Integer, Integer> hash = new HashMap<>();
        hash.put(1, 100);
        hash.put(4, 400);
        hash.put(5, 500);
        hash.put(3, 300);
        hash.put(2, 200);
        //convert map into set/Collection view for interation
        Set<Integer> keys = hash.keySet();
        for (Integer key : keys) {
            System.out.println(key);
        }
        Collection<Integer> values = hash.values();
        for (Integer value : values) {
            System.out.println(value);
        }
        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) //using map.entrySet() for iteration
        {
            System.out.println("id: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }
}
