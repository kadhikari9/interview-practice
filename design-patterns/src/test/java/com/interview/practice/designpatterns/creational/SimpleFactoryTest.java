package com.interview.practice.designpatterns.creational;

import com.interview.practice.designpatterns.creational.factorymethod.Vehicle;
import com.interview.practice.designpatterns.creational.simplefactory.SimpleVehicleFactory;
import org.junit.jupiter.api.Test;

public class SimpleFactoryTest {

    @Test
    public void testFactoryMethod() {
        Vehicle suv = SimpleVehicleFactory.INSTANCE.makeSuv();
        Vehicle sedan = SimpleVehicleFactory.INSTANCE.makeSedan();
        Vehicle truck = SimpleVehicleFactory.INSTANCE.makeTruck();

        suv.startEngine();
        suv.stopEngine();
        sedan.startEngine();
        sedan.stopEngine();
        truck.startEngine();
        truck.stopEngine();
    }
}
