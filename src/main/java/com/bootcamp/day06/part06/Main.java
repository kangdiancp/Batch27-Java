package com.bootcamp.day06.part06;


public class Main {
    public static void main(String[] args) {
        //call interface
        HRInterface hrInf = new HRImplementation();
        var listEmps = hrInf.initListEmps();
        hrInf.printEmps(listEmps);
    }
}
