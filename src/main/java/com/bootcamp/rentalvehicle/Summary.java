package com.bootcamp.rentalvehicle;

import java.util.List;

public interface Summary {
    public List<Car> initListCar(final Car... cars);

    public double getTotalIncomeCar(List<Car> cars);

    public void printListCar(List<Car> cars);
}
