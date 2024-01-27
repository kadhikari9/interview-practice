package com.interview.practice.designpatterns.creational.abstractfactory2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ToyotaTacoma implements Vehicle {
    @Override
    public void startEngine() {
        log.info("Starting ToyotaTacoma Engine");
    }

    @Override
    public void stopEngine() {
        log.info("Stopping ToyotaTacoma Engine");
    }
}
