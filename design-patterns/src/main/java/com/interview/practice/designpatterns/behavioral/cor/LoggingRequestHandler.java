package com.interview.practice.designpatterns.behavioral.cor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoggingRequestHandler extends AbstractRequestHandler {

    @Override
    public void handleRequest(GetAcctRequest getAcctRequest) {
        log.info("Handling Request By: LoggingRequestHandler");
        log.info("AcctNum:{}, CustNum:{}", getAcctRequest.getAcctNum(), getAcctRequest.getCustNum());

        if (nextRequestHandler != null) {
            log.info("Forwarding request to handler: {} ", ValidationHandler.class.getSimpleName());
            nextRequestHandler.handleRequest(getAcctRequest);
        }
    }
}
