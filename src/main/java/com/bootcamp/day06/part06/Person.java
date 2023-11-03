package com.bootcamp.day06.part06;

public abstract class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public abstract String infoPerson(); 
    


    
}
