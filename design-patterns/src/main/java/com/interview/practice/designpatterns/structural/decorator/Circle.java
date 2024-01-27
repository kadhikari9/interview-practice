package com.interview.practice.designpatterns.structural.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Circle implements Shape{

    @Override
    public void draw() {
    log.info("Shape: Circle");
    }
}
