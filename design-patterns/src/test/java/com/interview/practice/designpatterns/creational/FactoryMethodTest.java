package com.interview.practice.designpatterns.creational;

import com.interview.practice.designpatterns.creational.factorymethod.Vehicle;
import com.interview.practice.designpatterns.creational.factorymethod.VehicleFactory;
import com.interview.practice.designpatterns.creational.factorymethod.VehicleFactoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactoryMethodTest {

    @Test
    public void testFactoryMethod() {
        String[] vehicleTypes = new String[]{"Sedan", "SUV", "Truck"};

        for (String s : vehicleTypes) {
            VehicleFactory factory = new VehicleFactoryImpl();
            Assertions.assertNotNull(factory);
            Vehicle vehicle = factory.makeVehicle(s);
            vehicle.startEngine();
            vehicle.stopEngine();
        }
    }

}
