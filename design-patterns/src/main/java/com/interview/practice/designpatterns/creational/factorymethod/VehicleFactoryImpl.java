package com.interview.practice.designpatterns.creational.factorymethod;


public class VehicleFactoryImpl implements VehicleFactory {

    @Override
    public Vehicle makeVehicle(String type) {
        return switch (type) {
            case "Sedan" -> new TeslaModel3();
            case "SUV" -> new MadzaCX5();
            case "Truck" -> new ToyotaTundra();
            default -> null;
        };
    }
}
