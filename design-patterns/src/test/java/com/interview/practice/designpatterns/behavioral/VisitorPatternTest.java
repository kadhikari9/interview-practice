package com.interview.practice.designpatterns.behavioral;

import com.interview.practice.designpatterns.behavioral.visitor.Computer;
import com.interview.practice.designpatterns.behavioral.visitor.ComputerPart;
import com.interview.practice.designpatterns.behavioral.visitor.ComputerPartDisplayVisitor;
import org.junit.jupiter.api.Test;

public class VisitorPatternTest {

    @Test
    public void testVisitorPattern() {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
