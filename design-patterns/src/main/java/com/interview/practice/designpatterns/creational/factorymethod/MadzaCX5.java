package com.interview.practice.designpatterns.creational.factorymethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MadzaCX5 implements Vehicle {

    @Override
    public void startEngine() {
        log.info("Starting MadzaCX5 Gas Engine");
    }

    @Override
    public void stopEngine() {
        log.info("Stopping MadzaCX5 Gas Engine");
    }
}
