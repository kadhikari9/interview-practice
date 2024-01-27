package com.interview.practice.designpatterns.creational.abstractfactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ToyotaRAV4 implements SUV {

    @Override
    public void startEngine() {
        log.info("Starting ToyotaRAV4 SUV Engine");
    }

    @Override
    public void stopEngine() {
        log.info("Stopping ToyotaRAV4 SUV Engine");
    }
}
