package com.bootcamp.rentalvehicle;

import java.time.LocalDate;

public class Car extends Vehicle{

    private String noPolice;


    public Car(VechicleType vehicleType, String year, double price, double tax, int seat, LocalDate transactionDate,
            double totalIncome, String noPolice) {
        super(vehicleType, year, price, tax, seat, transactionDate, totalIncome);
        this.noPolice = noPolice;
    }



/*     @Override
    double getTotalIncome() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getTotalIncome'");
        return 0;
    } */



    public String getNoPolice() {
        return noPolice;
    }



    public void setNoPolice(String noPolice) {
        this.noPolice = noPolice;
    }
    

    
    
}
