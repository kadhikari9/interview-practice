package com.interview.practice.designpatterns.creational.abstractfactory2;

public class SUVFactory implements VehicleFactory {
    @Override
    public Vehicle makeVehicle() {
        return new ToyotaRAV4();
    }
}
