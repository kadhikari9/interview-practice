package com.interview.practice.aop;

import lombok.Getter;

@Getter
public class Employee {
    private String name;

    @Loggable
    public void setName(String name) {
        this.name = name;
    }

    public void throwException() {
        throw new RuntimeException("Dummy Exception");
    }
}
