package com.interview.practice.designpatterns.creational.prototype;

import lombok.Data;

@Data
public class Circle extends Shape {
    int radius;

    public Circle() {

    }

    public Circle(Circle source) {
        super(source);
        this.radius = source.radius;
    }

    @Override
    public Shape cloneShape() {
        return new Circle(this);
    }
}
