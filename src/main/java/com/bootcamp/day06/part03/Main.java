package com.bootcamp.day06.part03;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //using default constructor
        Employee emp1 = new Employee();
        emp1.setEmpId(1);
        emp1.setFirstName("kang");
        emp1.setBirthDay(LocalDate.of(2023,12,12));

        //using constructor parameterize
        Employee emp2 = new Employee(
            "Rini", 
            "Marlina", 
            LocalDate.of(2023, 10, 10), 
            4_5000, "Programmer", 
            "Permanent");

        System.out.println(emp2);

        Permanent emp3 = new Permanent("Widi", "Wini", 
        null, 0, null, null, 0, 0, 0);
    }
}
