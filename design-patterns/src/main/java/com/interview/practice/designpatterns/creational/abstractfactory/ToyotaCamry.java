package com.interview.practice.designpatterns.creational.abstractfactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ToyotaCamry implements Car {

    @Override
    public void startEngine() {
        log.info("Starting ToyotaCamry Car Engine");
    }

    @Override
    public void stopEngine() {
        log.info("Stopping ToyotaCamry Car Engine");
    }
}
