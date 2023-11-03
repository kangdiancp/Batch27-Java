package com.bootcamp.day06.part05;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        // using default constructor
        Employee emp1 = new Employee("Rini", "Marlina", 1,
                LocalDate.of(1998, Month.APRIL, 10),
                LocalDate.of(2021, Month.SEPTEMBER, 12), 5_000_000, "Software Dev", "Contract");

        Employee emp2 = new Employee("Wini", "Kosasih", 2,
                LocalDate.of(1998, Month.MAY, 12),
                LocalDate.of(2021, Month.SEPTEMBER, 12), 4_000_000, "QA", "Contract");

        Employee emp3 = new Employee("Yuli", "Ayu", 1,
                LocalDate.of(1997, Month.APRIL, 10),
                LocalDate.of(2021, Month.DECEMBER, 12), 4_500_000, "Software Dev", "Permanent");

        Contract emp4 = new Contract("Ratih","Wina",5,
        LocalDate.of(1999, Month.AUGUST, 17),LocalDate.of(2002, Month.DECEMBER, 18),
        5_000_000,"Dotnet Dev",null,450_000
        );

        Permanent emp5 = new Permanent("Nofal", "Vincent", 6, 
        LocalDate.of(1999, Month.AUGUST, 17), 
        LocalDate.of(1999, Month.SEPTEMBER, 17), 4_500_000, "Trainer", 
        null, 120_000, 50_000, 1);



        //polymorphism
        //convert permanent to employee
        Employee empPermanent = emp5; 
        //convert from employee to permanent
        Permanent yuliEmp = (Permanent) emp3; 

  

        System.out.println(emp1.infoPerson());
        System.out.println(emp4.infoPerson());
        System.out.println(empPermanent.infoPerson());
/*         System.out.println(emp2.infoPerson());
        System.out.println(emp3.infoPerson()); */

    }
}
