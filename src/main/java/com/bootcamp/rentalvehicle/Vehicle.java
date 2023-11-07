package com.bootcamp.rentalvehicle;

import java.time.LocalDate;

public abstract class Vehicle {
    // instance attribute
    private VechicleType vehicleType;
    private String year;
    private double price;
    private double tax;
    private int seat;
    private LocalDate transactionDate;
    private double totalIncome;

    public static int countVehicle;

    public Vehicle(VechicleType vehicleType, String year, double price, double tax, int seat) {
        this.vehicleType = vehicleType;
        this.year = year;
        this.price = price;
        this.tax = tax;
        this.seat = seat;
        countVehicle++;
    }

    public Vehicle(VechicleType vehicleType, String year, double price, double tax, int seat, LocalDate transactionDate,
            double totalIncome) {
        this.vehicleType = vehicleType;
        this.year = year;
        this.price = price;
        this.tax = tax;
        this.seat = seat;
        this.transactionDate = transactionDate;
        this.totalIncome = totalIncome;
        countVehicle++;
    }
    
   // abstract double getTotalIncome();

    @Override
    public String toString() {
        return "Vehicle [vehicleType=" + vehicleType + ", year=" + year + ", price=" + price + ", tax=" + tax
                + ", seat=" + seat + ", transactionDate=" + transactionDate + ", totalIncome=" + totalIncome + "]";
    }
    

    
    
    
}
