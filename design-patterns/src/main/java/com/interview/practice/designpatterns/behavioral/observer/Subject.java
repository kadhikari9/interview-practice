package com.interview.practice.designpatterns.behavioral.observer;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private final List<Observer> observerList = new ArrayList<>();

    @Getter
    private String message;

    public void update(String message) {
        this.message = message;
        notifyObservers();
    }

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

}
