package com.interview.practice.designpatterns.behavioral.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PayPalValidationStrategy implements PaymentMethodValidationStrategy{

    @Override
    public boolean validatePaymentMethod(PaymentMethod paymentMethod) {
        log.info("Validating Payment method using: PayPalValidationStrategy");
        return true;
    }
}
