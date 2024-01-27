package com.interview.practice.designpatterns.creational.prototype;

import lombok.Data;

@Data
public abstract class Shape {
    int x;
    int y;
    int color;

    public Shape() {

    }

    public Shape(Shape source) {
        this.x = source.x;
        this.y = source.y;
        this.color = source.color;
    }

    public abstract Shape cloneShape();
}
