package com.bootcamp.day06.part03;

import java.time.LocalDate;

public class Contract extends Employee{
    private double parkir;

    
    public Contract(String firstName, String lastName, LocalDate joinDate, double salary, String role, String status,
            double parkir) {
        super(firstName, lastName, joinDate, salary, role, status);
        this.parkir = parkir;
    }

    public double getParkir() {
        return parkir;
    }

    public void setParkir(double parkir) {
        this.parkir = parkir;
    }
}
