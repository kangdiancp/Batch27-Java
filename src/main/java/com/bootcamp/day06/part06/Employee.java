package com.bootcamp.day06.part06;

import java.time.LocalDate;

public class Employee extends Person {
    private int empId;
    private LocalDate birthDay;
    private LocalDate joinDate;
    private double salary;
    private String role;
    private String status;

    public Employee(String firstName, String lastName, int empId,
            LocalDate birthDay, LocalDate joinDate,
            double salary,
            String role, String status) {
        super(firstName, lastName);
        this.empId = empId;
        this.birthDay = birthDay;
        this.joinDate = joinDate;
        this.salary = salary;
        this.role = role;
        this.status = status;
    }

    @Override
    public String infoPerson() {
        return "Employee [empId=" + empId + ", birthDay=" + birthDay + ", joinDate=" + joinDate + ", salary=" + salary
                + ", role=" + role + ", status=" + status + "]";
    }


    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
