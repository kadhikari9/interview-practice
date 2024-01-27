package com.interview.practice.designpatterns.creational.abstractfactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ToyotaTacoma implements Truck {
    @Override
    public void startEngine() {
        log.info("Starting ToyotaTacoma Truck Engine");
    }

    @Override
    public void stopEngine() {
        log.info("Stopping ToyotaTacoma Truck Engine");
    }
}
