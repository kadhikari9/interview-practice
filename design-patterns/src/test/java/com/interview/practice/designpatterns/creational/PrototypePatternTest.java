package com.interview.practice.designpatterns.creational;

import com.interview.practice.designpatterns.creational.prototype.Circle;
import com.interview.practice.designpatterns.creational.prototype.Rectangle;
import com.interview.practice.designpatterns.creational.prototype.Shape;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class PrototypePatternTest {

    @Test
    public void testProtoTypePattern() {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Rectangle rectangle = new Rectangle();
        rectangle.setX(3);
        rectangle.setY(4);
        rectangle.setColor(1);
        rectangle.setWidth(10);
        rectangle.setLength(20);
        shapes.add(rectangle);

        Circle circle = new Circle();
        rectangle.setX(3);
        rectangle.setY(4);
        rectangle.setColor(1);
        circle.setRadius(5);
        shapes.add(circle);

        for (Shape s : shapes) {
            shapesCopy.add(s.cloneShape());
        }

        for (int i = 0; i < shapes.size(); i++) {
            Shape current = shapes.get(i);
            Shape copyOf = shapesCopy.get(i);

            Assertions.assertEquals(current, copyOf);

        }
    }

}
