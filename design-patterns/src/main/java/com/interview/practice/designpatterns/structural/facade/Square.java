package com.interview.practice.designpatterns.structural.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Square implements Shape {

    @Override
    public void draw() {
        log.info("Square::draw()");
    }
}