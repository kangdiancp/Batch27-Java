package com.bootcamp.rentalvehicle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummaryImpl implements Summary{

    @Override
    public List<Car> initListCar(Car... cars) {
        // TODO Auto-generated method stub
        List<Car> listOfCar = new ArrayList<>();
        listOfCar = Arrays.asList(cars);
        return listOfCar;
    }

    @Override
    public double getTotalIncomeCar(List<Car> cars) {

        double totalIncome =0.0;
        for (Car car : cars) {
            if(car instanceof SUV){
                totalIncome += ((SUV)car).getTotalIncome();
            }else if (car instanceof Taxi){
                totalIncome += ((Taxi)car).getTotalIncome();
            }
        }
        return totalIncome;
    }

    @Override
    public void printListCar(List<Car> cars) {
        // TODO Auto-generated method stub
        cars.forEach(System.out::println);
    }
    
}
