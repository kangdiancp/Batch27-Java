package com.bootcamp.rentalvehicle;

public class Main {

    public static void main(String[] args) {
        SUV suv1 = new SUV("2023", 5_000_0000,
                .15, 4, null, 0, "D1009UM", 500_000, 300_000);
        
        System.out.println(suv1.toString());
        
        System.out.println("SUV total income1 ; "+suv1.getTotalIncome());
        
        suv1.setDriver(175_000);
        System.out.println("SUV total income2 ; "+suv1.getTotalIncome());
        
        Taxi taxi1 = new Taxi("2023", 5_000_0000,
                .15, 4, null, 0, "D1010UM", 10, 7_500);
        System.out.println(taxi1);

        //call interface & implementation
            //Summary summaryInf = new SummaryCarImpl();
        Summary summaryInf = new SummaryImpl();
        var listOfCar = summaryInf.initListCar(suv1,taxi1);
        summaryInf.printListCar(listOfCar);

        System.out.println("TotalIncome Cars : "+summaryInf.getTotalIncomeCar(listOfCar));

        System.out.println("Total Vehicle : "+Vehicle.countVehicle);
    }

}
