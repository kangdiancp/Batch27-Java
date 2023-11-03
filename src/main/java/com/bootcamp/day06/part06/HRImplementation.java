package com.bootcamp.day06.part06;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HRImplementation implements HRInterface{

    @Override
    public List<Employee> initListEmps() {
       

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

         List<Employee> listEmps = List.of(emp1,emp2,emp3,emp4,emp5);
         
        return listEmps;
    }

    @Override
    public void printEmps(List<Employee> listEmps) {
        for (Employee employee : listEmps) {
            System.out.println(employee.infoPerson());
        }
    }

    @Override
    public double totalGrossSalary() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'totalGrossSalary'");
    }

    @Override
    public List<Employee> initListEmps(Employee... emps) {
        List<Employee> listEmp = new ArrayList<>();
        listEmp = Arrays.asList(emps);
        return listEmp;

    }

}
