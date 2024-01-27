package com.interview.practice.designpatterns.creational.factory;

import com.interview.practice.designpatterns.creational.abstractfactory2.Vehicle;
import com.interview.practice.designpatterns.creational.simplefactory.SimpleVehicleFactory;
import org.junit.jupiter.api.Test;

public class SimpleFactoryTest {

    @Test
    public void testFactoryMethod() {
        Vehicle suvFactory = SimpleVehicleFactory.INSTANCE.makeSuv();
        Vehicle sedanFactory = SimpleVehicleFactory.INSTANCE.makeSedan();
        Vehicle truckFactory = SimpleVehicleFactory.INSTANCE.makeTruck();

        suvFactory.startEngine();
        suvFactory.stopEngine();
        sedanFactory.startEngine();
        sedanFactory.stopEngine();
        truckFactory.startEngine();
        truckFactory.stopEngine();
    }
}
