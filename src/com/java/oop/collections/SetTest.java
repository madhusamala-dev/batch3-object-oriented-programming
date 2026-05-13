package com.java.oop.collections;

import com.java.oop.util.CustomerIdComparatorAsc;
import com.java.oop.util.CustomerIdComparatorDesc;
import com.java.oop.util.CustomerNameComparatorDesc;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        TreeSet<String> hs = new TreeSet<>();
        hs.add("customer4");
        hs.add("customer2");
        hs.add("customer3");
        hs.add("customer1");
        hs.add("customer1");
        System.out.println(hs.size());
        System.out.println(hs.remove("customer2"));
        System.out.println(hs);

        Iterator<String> iterator = hs.iterator();
        while(iterator.hasNext()){
          //  System.out.println(iterator.next());
            String name  = iterator.next();
            System.out.println(name.toUpperCase());
        }

        /*  Customer Set */
        TreeSet<Customer> customerSet = new TreeSet<>(new CustomerNameComparatorDesc());
        customerSet.add(new Customer(111,"customer1","customer1@gmail.com"));
        customerSet.add(new Customer(222,"customer2","customer2@gmail.com"));
        customerSet.add(new Customer(555,"customer5","customer5@gmail.com"));

        customerSet.add(new Customer(333,"customer3","customer3@gmail.com"));

        customerSet.add(new Customer(444,"customer4","customer4@gmail.com"));
        customerSet.add(new Customer(222,"customer2","customer2@gmail.com"));


        System.out.println(customerSet);
    }
}
