package com.bootcamp.day01;

import java.util.ArrayList;
import java.util.List;

public class Problem03 {
    public static void main(String[] args) {
        findDivisior(24);

        List<Integer> myList = findDivisiorList(24);
        for (Integer item: myList) {
            System.out.println("item : "+item);
        }

    }

    static void findDivisior(final int value){
        for (int i = 1; i < value; i++) {
            if (value % i ==0){
                System.out.println(i);
            }
        }
    }

    static List<Integer> findDivisiorList(final int value){
        final List<Integer> divisiors = new ArrayList<Integer>();

        for (int i = 1; i < value; i++) {
            if (value % i ==0){
                divisiors.add(i);
            }
        }

        return divisiors;
    }
}
