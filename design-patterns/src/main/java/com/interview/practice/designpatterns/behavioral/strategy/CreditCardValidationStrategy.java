package com.interview.practice.designpatterns.behavioral.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CreditCardValidationStrategy implements PaymentMethodValidationStrategy {
    @Override
    public boolean validatePaymentMethod(PaymentMethod paymentMethod) {
        log.info("Validating Payment Method using: CreditCardValidationStrategy");

        return true;
    }
}
