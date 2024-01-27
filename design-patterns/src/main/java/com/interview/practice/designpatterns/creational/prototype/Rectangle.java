package com.interview.practice.designpatterns.creational.prototype;


import lombok.Data;

@Data
public class Rectangle extends Shape {
    int width;
    int length;

    public Rectangle() {

    }

    public Rectangle(Rectangle source) {
        super(source);
        this.width = source.width;
        this.length = source.length;
    }

    public Shape cloneShape() {
        return new Rectangle(this);
    }
}
