package com.interview.practice.designpatterns.creational.abstractfactory2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ToyotaRAV4 implements Vehicle {

    @Override
    public void startEngine() {
        log.info("Starting ToyotaRAV4 Engine");
    }

    @Override
    public void stopEngine() {
        log.info("Stopping ToyotaRAV4 Engine");
    }
}
