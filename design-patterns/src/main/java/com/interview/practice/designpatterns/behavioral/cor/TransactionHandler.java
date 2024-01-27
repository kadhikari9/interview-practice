package com.interview.practice.designpatterns.behavioral.cor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TransactionHandler extends AbstractRequestHandler {
    @Override
    public void handleRequest(GetAcctRequest getAcctRequest) {
        log.info("Handling Request By: TransactionHandler");
        log.info("Retrieving Acct using Cust Nume:{}, AcctNum:{}", getAcctRequest.getAcctNum(), getAcctRequest.getCustNum());

        if (nextRequestHandler != null) {
            nextRequestHandler.handleRequest(getAcctRequest);
            log.info("Forwarding Request to next handler:{}", nextRequestHandler.getClass().getSimpleName());
        } else {
            log.info("Next Request Handler is Null, Request Completed!!!");
        }
    }
}
