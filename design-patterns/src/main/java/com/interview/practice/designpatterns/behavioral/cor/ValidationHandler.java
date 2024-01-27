package com.interview.practice.designpatterns.behavioral.cor;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class ValidationHandler extends AbstractRequestHandler {
    @Override
    public void handleRequest(GetAcctRequest getAcctRequest) {
        log.info("Handling Request By: ValidationHandler");
        if (StringUtils.isBlank(getAcctRequest.getAcctNum()) || StringUtils.isBlank(getAcctRequest.getCustNum())) {
            log.error("The request is Invalid");
        } else if (nextRequestHandler != null) {
            log.error("The request is Valid");
            log.info("Forwarding Request to next handler:{}", nextRequestHandler.getClass().getSimpleName());
            nextRequestHandler.handleRequest(getAcctRequest);
        } else {
            log.info("Next Request Handler is Null, Request Completed!!!");
        }
    }
}
