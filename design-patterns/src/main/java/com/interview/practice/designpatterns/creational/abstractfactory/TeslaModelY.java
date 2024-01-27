package com.interview.practice.designpatterns.creational.abstractfactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TeslaModelY implements SUV {

    @Override
    public void startEngine() {
        log.info("Starting TeslaModelY SUV Engine");
    }

    @Override
    public void stopEngine() {
        log.info("Stopping TeslaModelY SUV Engine");
    }
}
