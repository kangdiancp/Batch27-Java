package com.bootcamp.rentalvehicle;

import java.time.LocalDate;

public class SUV extends Car implements RentOrder {

    private double rent;
    private double driver;


    public SUV(String year, double price, double tax, int seat, LocalDate transactionDate,
            double totalIncome, String noPolice, double rent, double driver) {
        super(VechicleType.SUV, year, price, tax, seat, transactionDate, totalIncome, noPolice);
        this.rent = rent;
        this.driver = driver;
    }


    public double getRent() {
        return rent;
    }


    public void setRent(double rent) {
        this.rent = rent;
    }


    public double getDriver() {
        return driver;
    }


    public void setDriver(double driver) {
        this.driver = driver;
    }


    @Override
    public String toString() {
        return super.toString()+ " Income [rent=" + rent + ", driver=" + driver + "]";
    }


    @Override
    public double getTotalIncome() {
        // TODO Auto-generated method stub
        return this.driver + this.rent;
    }


}
    


    




    

    
    


