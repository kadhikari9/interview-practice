package com.interview.practice.designpatterns.creational.abstractfactory2;

public class SedanFactory implements VehicleFactory {

    @Override
    public Vehicle makeVehicle() {
        return new ToyotaCamry();
    }
}
