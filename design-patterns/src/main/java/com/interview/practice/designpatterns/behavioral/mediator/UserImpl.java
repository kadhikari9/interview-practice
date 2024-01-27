package com.interview.practice.designpatterns.behavioral.mediator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserImpl extends User {

    public UserImpl(ChatMediator med, String name) {
        super(med, name);
    }

    @Override
    public void send(String msg) {
        log.info(this.name + ": Sending Message: {}", msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        log.info(this.name + ": Received Message: {}", msg);
    }
}
