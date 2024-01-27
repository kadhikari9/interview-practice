package com.interview.practice.designpatterns.creational.factorymethod;


public class VehicleFactoryImpl implements VehicleFactory {

    @Override
    public Vehicle makeVehicle(String type) {
        return switch (type) {
            case "Electric" -> new TeslaModelX();
            case "Gas" -> new MadzaCX5();
            default -> null;
        };
    }
}
