package com.interview.practice.designpatterns.creational.factorymethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TeslaModelX implements Vehicle {
    @Override
    public void startEngine() {
        log.info("Starting TeslaModelX Electric Engine");
    }

    @Override
    public void stopEngine() {
        log.info("Stopping TeslaModelX Electric Engine");
    }
}
