package com.interview.practice.designpatterns.behavioral.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BankAccountValidationStrategy implements PaymentMethodValidationStrategy {
    @Override
    public boolean validatePaymentMethod(PaymentMethod paymentMethod) {
        log.info("Validating Payment Method using: BankAccountValidationStrategy");
        return true;
    }
}
