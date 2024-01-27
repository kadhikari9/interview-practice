package com.interview.practice.designpatterns.creational.abstractfactory;

public class TeslaVehicleFactory implements VehicleFactory {
    @Override
    public Car getCar() {
        return new TeslaModel3();
    }

    @Override
    public Truck getTruck() {
        return new TeslaCyberTruck();
    }

    @Override
    public SUV getSUV() {
        return new TeslaModelY();
    }
}
