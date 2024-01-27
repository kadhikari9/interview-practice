package com.interview.practice.designpatterns.behavioral.strategy;

public interface PaymentMethodValidationStrategy {

    boolean validatePaymentMethod(PaymentMethod paymentMethod);
}
