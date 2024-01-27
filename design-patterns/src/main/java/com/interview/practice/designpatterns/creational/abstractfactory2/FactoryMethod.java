package com.interview.practice.designpatterns.creational.abstractfactory2;

public class FactoryMethod {
    public static VehicleFactory getFactory(String type) {
        if ("SEDAN".equalsIgnoreCase(type)) {
            return new SedanFactory();
        }

        if ("TRUCK".equalsIgnoreCase(type)) {
            return new TruckFactory();
        }

        if ("SUV".equalsIgnoreCase(type)) {
            return new SUVFactory();
        }

        return null;
    }

}
