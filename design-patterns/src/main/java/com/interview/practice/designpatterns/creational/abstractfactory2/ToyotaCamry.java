package com.interview.practice.designpatterns.creational.abstractfactory2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ToyotaCamry implements Vehicle {

    @Override
    public void startEngine() {
        log.info("Starting ToyotaCamry Engine");
    }

    @Override
    public void stopEngine() {
        log.info("Stopping ToyotaCamry Engine");
    }
}
