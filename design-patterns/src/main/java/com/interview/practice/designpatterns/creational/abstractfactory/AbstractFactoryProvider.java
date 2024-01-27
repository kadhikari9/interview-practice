package com.interview.practice.designpatterns.creational.abstractfactory;

public enum AbstractFactoryProvider {
    INSTANCE;
    public  VehicleFactory getFactory(String model) {
        if (model.equalsIgnoreCase("Tesla")) {
            return new TeslaVehicleFactory();
        }
        if (model.equalsIgnoreCase("Toyota")) {
            return new ToyotaVehicleFactory();
        }

        return null;
    }
}
