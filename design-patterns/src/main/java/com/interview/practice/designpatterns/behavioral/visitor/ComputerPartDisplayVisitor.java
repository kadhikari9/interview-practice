package com.interview.practice.designpatterns.behavioral.visitor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        log.info("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        log.info("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        log.info("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        log.info("Displaying Monitor.");
    }
}