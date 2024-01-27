package com.interview.practice.designpatterns.creational.abstractfactory;

public class ToyotaVehicleFactory implements VehicleFactory{
    @Override
    public Car getCar() {
        return new ToyotaCamry();
    }

    @Override
    public Truck getTruck() {
        return new ToyotaTacoma();
    }

    @Override
    public SUV getSUV() {
        return new ToyotaRAV4();
    }
}
