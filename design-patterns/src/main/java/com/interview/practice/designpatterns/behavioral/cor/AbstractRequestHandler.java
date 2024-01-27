package com.interview.practice.designpatterns.behavioral.cor;

public abstract class AbstractRequestHandler implements RequestHandler {

    protected RequestHandler nextRequestHandler;

    @Override
    public void setNextHandler(RequestHandler nextHandler) {
        this.nextRequestHandler = nextHandler;
    }

}
