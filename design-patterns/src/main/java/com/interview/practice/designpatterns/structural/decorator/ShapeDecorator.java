package com.interview.practice.designpatterns.structural.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class ShapeDecorator implements Shape {

    private Shape shape;

    public void draw() {
        shape.draw();
    }
}
