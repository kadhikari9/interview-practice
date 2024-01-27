package com.interview.practice.designpatterns.structural;

import com.interview.practice.designpatterns.structural.decorator.Circle;
import com.interview.practice.designpatterns.structural.decorator.Rectangle;
import com.interview.practice.designpatterns.structural.decorator.RedShapeDecorator;
import com.interview.practice.designpatterns.structural.decorator.Shape;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class DecoratorPatternTest {

    @Test
    public void testDecoratorPattern() {
        Shape rectangle = new Rectangle();
        log.info("Rectangle with normal border");
        rectangle.draw();
        log.info("Circle with normal border");
        Shape circle = new Circle();
        circle.draw();


        Shape redRectangle = new RedShapeDecorator(rectangle);
        log.info("Rectangle with red border");
        redRectangle.draw();

        Shape redCircle = new RedShapeDecorator(circle);
        log.info("Circle with red border");
        redCircle.draw();
    }
}
