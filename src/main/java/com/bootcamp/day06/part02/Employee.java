package com.bootcamp.day06.part02;

import java.time.LocalDate;

public class Employee {
    private int empId;
    private String firstName;
    private String lastName;
    private LocalDate birthDay;
    private LocalDate joinDate;
    private double salary;
    private String role;
    private String status;
    private double tjgMedical;
    private double bpjs;
    private double parkir;
    private double bonus;
    private double totalSalary;

    
    //default constructor
    public Employee() {
    }

    // constructor parameterize
    public Employee(String firstName, String lastName, 
    LocalDate joinDate, 
    double salary, String role, String status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.joinDate = joinDate;
        this.salary = salary;
        this.role = role;
        this.status = status;
    }
    //constructor overloading
    public Employee(int empId, String firstName, 
    String lastName, LocalDate birthDay, 
    LocalDate joinDate, double salary,
            String role, String status) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.joinDate = joinDate;
        this.salary = salary;
        this.role = role;
        this.status = status;
    }

    

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", joinDate="
                + joinDate + ", salary=" + salary + ", role=" + role + ", status=" + status + "]";
    }

    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
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
    public double getTjgMedical() {
        return tjgMedical;
    }
    public void setTjgMedical(double tjgMedical) {
        this.tjgMedical = tjgMedical;
    }
    public double getBpjs() {
        return bpjs;
    }
    public void setBpjs(double bpjs) {
        this.bpjs = bpjs;
    }
    public double getParkir() {
        return parkir;
    }
    public void setParkir(double parkir) {
        this.parkir = parkir;
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getTotalSalary() {
        return totalSalary;
    }
    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }
}
