package com.interview.practice.designpatterns.behavioral.visitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}