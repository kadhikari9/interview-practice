package com.interview.practice.designpatterns.creational.abstractfactory2;

public class TruckFactory implements VehicleFactory {

    @Override
    public Vehicle makeVehicle() {
        return new ToyotaTacoma();
    }
}
