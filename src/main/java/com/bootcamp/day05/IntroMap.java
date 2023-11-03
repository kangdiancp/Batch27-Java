package com.bootcamp.day05;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class IntroMap {
    public static void main(String[] args) {
        //initMap();
        initStack();
    }

    static void initMap() {
        HashMap<Integer,String> categories = new HashMap<Integer,String>();
        categories.put(1,"Electronic");
        categories.put(2,"Gym Tools");
        categories.put(3,"T-Shirt");
        categories.put(4,"Cooking Tools");
        categories.put(4,"Washing Machine");

        //using for
        for (Map.Entry<Integer, String> entry : categories.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key: "+key+" value: "+value);
        }

        //using lambda
        categories.forEach((k,v) -> System.out.println("key: "+k+" value: "+v));
    }

    static void initStack(){
        final Stack<String> stack = new Stack<>();
        stack.push("yuli");
        stack.push("widi");
        stack.push("rini");

        System.out.println("Peek : "+stack.peek());
        System.out.println("Pop : "+stack.pop());
        System.out.println("Pop : "+stack.pop());
        System.out.println("IsEmpty : "+stack.isEmpty());
    }
}
