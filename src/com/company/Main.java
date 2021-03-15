package com.company;

import java.util.ArrayList;
import java.util.List;

public  class Main {
    public static void main(String[] args) {
        Car prius = new PassengerCar("Toyota Prius" , 2008 , 15000 , 1200 , Color.Green);
        Car renualt = new Bus("Renault Laguna" , 2001 , 9700 , 1600 , Color.White);
        Car renualt2 = new Bus("Renault Laguna" , 2001 , 9700 , 1600 , Color.White);

        List<Car> cars = new ArrayList<>();

        cars.add(prius);
        cars.add(renualt);
        cars.add(renualt2);

        System.out.println(cars);

        prius.addDistance(1001);
        prius.addDistance(2002);
        prius.addDistance(21.5);
        prius.addDistance(15000);
        renualt.addDistance(15000);

        System.out.println(prius);
        System.out.println(renualt);

      //  System.out.println(prius.equals(renualt2));
     //   System.out.println(renualt.equals(renualt2));

        System.out.println(prius.isReadyToService());
        System.out.println(renualt.isReadyToService());
    }
}

