package com.bootcamp.day05;

import java.util.HashSet;
import java.util.Set;

public class IntroSet {
    public static void main(String[] args) {
        initHashSet();
    }

    static void initHashSet() {
        // interface bisa gunakan Set atau HashSet
        //Set<Integer> intSet = new HashSet<Integer>();
        HashSet<Integer> intSet = new HashSet<Integer>();
        intSet.add(2);
        intSet.add(7);
        intSet.add(7);
        intSet.add(3);

        intSet.forEach(System.out::println);
    }
}
