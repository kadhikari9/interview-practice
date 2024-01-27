package com.interview.practice.designpatterns.creational.simplefactory;

import com.interview.practice.designpatterns.creational.factorymethod.MadzaCX5;
import com.interview.practice.designpatterns.creational.factorymethod.TeslaModel3;
import com.interview.practice.designpatterns.creational.factorymethod.ToyotaTundra;
import com.interview.practice.designpatterns.creational.factorymethod.Vehicle;

public enum SimpleVehicleFactory {
    INSTANCE;

    public Vehicle makeSuv() {
        return new MadzaCX5();
    }

    public Vehicle makeSedan() {
        return new TeslaModel3();
    }

    public Vehicle makeTruck() {
        return new ToyotaTundra();
    }
}
