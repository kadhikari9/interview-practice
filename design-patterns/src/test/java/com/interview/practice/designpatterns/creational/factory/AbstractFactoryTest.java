package com.interview.practice.designpatterns.creational.factory;

import com.interview.practice.designpatterns.creational.abstractfactory.AbstractFactoryProvider;
import com.interview.practice.designpatterns.creational.abstractfactory.VehicleFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {

    @Test
    public void testAbstractFactory() {
        String[] vehicleProvider = new String[]{"Toyota", "Tesla"};

        for (String s : vehicleProvider) {
            VehicleFactory factory = AbstractFactoryProvider.INSTANCE.getFactory(s);
            Assertions.assertNotNull(factory);
            factory.getTruck().startEngine();
            factory.getCar().startEngine();
            factory.getSUV().startEngine();
            factory.getTruck().stopEngine();
            factory.getCar().stopEngine();
            factory.getSUV().stopEngine();
        }

    }
}
