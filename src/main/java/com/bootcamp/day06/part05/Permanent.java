package com.bootcamp.day06.part05;

import java.time.LocalDate;

public class Permanent extends Employee {
    private double medical;
    private double bpjs;
    private double bonus;

    

    public Permanent(String firstName, String lastName, int empId, LocalDate birthDay, LocalDate joinDate,
            double salary, String role, String status, double medical, double bpjs, double bonus) {
        super(firstName, lastName, empId, birthDay, joinDate, salary, role, status);
        this.medical = medical;
        this.bpjs = bpjs;
        this.bonus = bonus;
    }

    public double getMedical() {
        return medical;
    }

    public void setMedical(double medical) {
        this.medical = medical;
    }

    public double getBpjs() {
        return bpjs;
    }

    public void setBpjs(double bpjs) {
        this.bpjs = bpjs;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

}
