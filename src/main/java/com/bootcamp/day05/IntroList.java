package com.bootcamp.day05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class IntroList {
    public static void main(String[] args) {
        initList();
    }

    static void initJavaCollection() {
        final List<Integer> intList = new ArrayList<Integer>();
        final HashSet<Integer> intSet = new HashSet<Integer>();
        final Map<String, Integer> mapObj = new HashMap<String, Integer>();
    }

    static void initStack(){
        
    }
    
    static void initList() {

        final List<Integer> listNum1 = new ArrayList<Integer>();
        listNum1.add(1);
        listNum1.add(2);

        final List<Integer> listNums2 = new ArrayList<Integer>();

        listNums2.add(3);
        listNums2.add(4);

        //List<Integer> primeNumberx = List.of(2,3,5,7,11,13);
        // bisa gunakan var untuk direct initial list
        final var primeNumber = List.of(2,3,5,7,11,13);

        listNums2.addAll(listNum1);

        listNums2.forEach(System.out::println);
        System.out.println("Remove object");
        listNums2.remove(0);
        listNums2.addAll(primeNumber);
        listNums2.forEach(System.out::println);
    }
}
