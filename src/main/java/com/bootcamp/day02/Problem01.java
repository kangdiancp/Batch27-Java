package com.bootcamp.day02;

import java.util.HashSet;
import java.util.Set;

public class Problem01 {
    public static void main(String[] args) {
        
        final Set<Character> mySet = new HashSet<>();
        
        mySet.add('A');
        mySet.add('B');
        mySet.add('C');
        mySet.add('A');

        for (Character character : mySet) {
            System.out.println(character);
        }

        //checkNoDuplicateChar
        String myString = "codeid";

        
        System.out.println("result : "+checkNoDuplicateChar(myString));

    }

    static boolean checkNoDuplicateChar(String words){
        final char[]allCharInput = words.toLowerCase().toCharArray();
        
        final Set<Character> containedChars = new HashSet<>();
        
        for (Character item : allCharInput) {
            if (containedChars.contains(item))
                return false;
            
                containedChars.add(item);
        }


        return true;
    }


}
