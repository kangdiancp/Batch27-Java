package com.bootcamp.day06.part06;

import java.time.LocalDate;

public class Contract extends Employee{
    private double parkir;

    
   

    public Contract(String firstName, String lastName, int empId, LocalDate birthDay, LocalDate joinDate, double salary,
            String role, String status, double parkir) {
        super(firstName, lastName, empId, birthDay, joinDate, salary, role, "CONTRACT");
        this.parkir = parkir;
    }

    public double getParkir() {
        return parkir;
    }

    public void setParkir(double parkir) {
        this.parkir = parkir;
    }
}
