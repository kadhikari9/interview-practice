package com.interview.practice.designpatterns.creational.simplefactory;

import com.interview.practice.designpatterns.creational.abstractfactory2.ToyotaCamry;
import com.interview.practice.designpatterns.creational.abstractfactory2.ToyotaRAV4;
import com.interview.practice.designpatterns.creational.abstractfactory2.ToyotaTacoma;
import com.interview.practice.designpatterns.creational.abstractfactory2.Vehicle;

public enum SimpleVehicleFactory {

    INSTANCE;

    public Vehicle makeSuv() {
        return new ToyotaRAV4();
    }

    public Vehicle makeSedan() {
        return new ToyotaCamry();
    }

    public Vehicle makeTruck() {
        return new ToyotaTacoma();
    }
}
