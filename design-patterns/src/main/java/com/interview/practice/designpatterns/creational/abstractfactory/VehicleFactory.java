package com.interview.practice.designpatterns.creational.abstractfactory;

public interface VehicleFactory {
    Car getCar();
    Truck getTruck();

    SUV getSUV();
}
