package com.interview.practice.designpatterns.behavioral.observer;

import org.junit.jupiter.api.Test;

public class ObserverPatternTest {

    @Test
    public void testObserver() {
        Subject subject = new Subject();
        Observer mysql = new MySQLObserver(subject);
        Observer kafka = new KafkaObserver(subject);

        subject.update("Hi There, this is first message");
        subject.update("Hi There, this is second message");
    }
}
