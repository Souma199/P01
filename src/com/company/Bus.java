package com.company;

public class Bus extends PassengerCar {
    public Bus(String name, int yearOfProduction, int price, int weight, Color color) {
        super(name, yearOfProduction, price, weight, color);
    }

    @Override
    public boolean isReadyToService() {
        if (distanceOnService > 50000) {
            return true;
        } else {
            return false;
        }
    }
}
