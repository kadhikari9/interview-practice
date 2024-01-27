package com.interview.practice.designpatterns.creational.factorymethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ToyotaTundra implements Vehicle{
    @Override
    public void startEngine() {
        log.info("Starting Toyota Tundra Truck Engine");
    }

    @Override
    public void stopEngine() {
        log.info("Stopping Toyota Tundra Truck Engine");
    }
}
