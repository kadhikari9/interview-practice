package com.interview.practice.designpatterns.creational.abstractfactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TeslaModel3 implements Car {

    @Override
    public void startEngine() {
        log.info("Starting TeslaModel3 Car Engine");
    }

    @Override
    public void stopEngine() {
        log.info("Stopping TeslaModel3 Car Engine");
    }
}
