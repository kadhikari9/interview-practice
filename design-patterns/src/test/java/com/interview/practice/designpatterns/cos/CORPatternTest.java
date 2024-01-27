package com.interview.practice.designpatterns.cos;

import com.interview.practice.designpatterns.behavioral.cor.*;
import org.junit.jupiter.api.Test;

public class CORPatternTest {

    @Test
    public void testChainOfResponsibility() {
        RequestHandler loggingRequestHandler = new LoggingRequestHandler();
        RequestHandler validationRequestHandler = new ValidationHandler();
        RequestHandler transactionHandler = new TransactionHandler();
        loggingRequestHandler.setNextHandler(validationRequestHandler);
        validationRequestHandler.setNextHandler(transactionHandler);

        GetAcctRequest getAcctRequest = new GetAcctRequest();
        getAcctRequest.setAcctNum("23232");
        getAcctRequest.setCustNum("23232");
        loggingRequestHandler.handleRequest(getAcctRequest);
    }
}
