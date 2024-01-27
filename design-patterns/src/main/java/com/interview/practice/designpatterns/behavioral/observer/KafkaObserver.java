package com.interview.practice.designpatterns.behavioral.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class KafkaObserver extends Observer {

    public KafkaObserver(Subject subject) {
        super(subject);
        subject.addObserver(this);
    }

    @Override
    public void update() {
        log.info("Received new message from subject, publishing to kafka");
        log.info("Message: {}", this.subject.getMessage());
    }
}
