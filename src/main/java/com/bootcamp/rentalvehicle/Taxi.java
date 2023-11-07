package com.bootcamp.rentalvehicle;

import java.time.LocalDate;

public class Taxi extends Car implements RentOrder{
    private int order;
    private double orderPerKm;

    public Taxi(String year, double price, double tax, int seat, LocalDate transactionDate,
            double totalIncome, String noPolice, int order, double orderPerKm) {
        super(VechicleType.TAXI, year, price, tax, seat, transactionDate, totalIncome, noPolice);
        this.order = order;
        this.orderPerKm = orderPerKm;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public double getOrderPerKm() {
        return orderPerKm;
    }

    public void setOrderPerKm(double orderPerKm) {
        this.orderPerKm = orderPerKm;
    }

    @Override
    public String toString() {
        return super.toString()+ " Income [order=" + order + ", orderPerKm=" + orderPerKm + "]";
    }

    @Override
    public double getTotalIncome() {
        // TODO Auto-generated method stub
        return this.orderPerKm * this.order;
    }


    
    
    
}
