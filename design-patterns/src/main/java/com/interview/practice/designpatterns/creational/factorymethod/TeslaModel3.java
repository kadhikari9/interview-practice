package com.interview.practice.designpatterns.creational.factorymethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TeslaModel3 implements Vehicle {
    @Override
    public void startEngine() {
        log.info("Starting TeslaModel3 Electric Sedan Engine");
    }

    @Override
    public void stopEngine() {
        log.info("Stopping TeslaModel3 Electric Sedan Engine");
    }
}
