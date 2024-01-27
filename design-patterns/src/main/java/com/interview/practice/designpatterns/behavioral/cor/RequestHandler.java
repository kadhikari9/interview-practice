package com.interview.practice.designpatterns.behavioral.cor;

public interface RequestHandler {

    void setNextHandler(RequestHandler nextHandler);

    void handleRequest(GetAcctRequest getAcctRequest);
}
