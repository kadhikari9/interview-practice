package com.interview.practice.designpatterns.structural;

import com.interview.practice.designpatterns.structural.facade.ShapeFacade;
import org.junit.jupiter.api.Test;

public class FacadePatternTest {

    @Test
    public void testFacade() {
        ShapeFacade shapeFacade = new ShapeFacade();
        shapeFacade.drawCircle();
        shapeFacade.drawRectangle();
        shapeFacade.drawSquare();
    }
}
