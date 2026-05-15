package com.java.oop.collections.map;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        TreeMap<Integer, Customer> map = new TreeMap<>();
        map.put(101, new Customer(101, "customer1", "customer1@gmail.com"));
        map.put(102, new Customer(102, "customer2", "customer2@gmail.com"));
        map.put(105, new Customer(105, "customer5", "customer5@gmail.com"));

        map.put(104, new Customer(104, "customer4", "customer4@gmail.com"));

        map.put(103, new Customer(103, "customer3", "customer3@gmail.com"));
        map.put(102, new Customer(102, "abcd", "abcd@gmail.com"));

        System.out.println(map);
        System.out.println(map.get(102));

        Set<Map.Entry<Integer, Customer>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, Customer>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, Customer> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
