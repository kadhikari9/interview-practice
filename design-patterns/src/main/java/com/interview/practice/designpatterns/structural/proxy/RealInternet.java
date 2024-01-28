package com.interview.practice.designpatterns.structural.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RealInternet implements Internet {
    @Override
    public void connectTo(String host) {
        log.info("Connecting to: {}", host);
    }
}
