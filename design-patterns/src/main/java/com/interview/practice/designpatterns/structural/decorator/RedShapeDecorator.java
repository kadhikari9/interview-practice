package com.interview.practice.designpatterns.structural.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    public void draw() {
        super.draw();
        addRedBorder();
    }

    private void addRedBorder() {
        log.info("Adding Red Border");
    }
}
