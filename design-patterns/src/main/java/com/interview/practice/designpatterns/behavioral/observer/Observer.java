package com.interview.practice.designpatterns.behavioral.observer;

public abstract class Observer {

    protected Subject subject;

    public abstract void update();

    public Observer(Subject subject) {
        this.subject = subject;
    }
}
