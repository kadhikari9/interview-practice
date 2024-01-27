package com.interview.practice.designpatterns.behavioral.strategy;

public class PaymentMethodValidationContext {

    private final PaymentMethodValidationStrategy paymentMethodValidationStrategy;

    public PaymentMethodValidationContext(PaymentMethodValidationStrategy paymentMethodValidationStrategy) {
        this.paymentMethodValidationStrategy = paymentMethodValidationStrategy;
    }

    public boolean validatePaymentMethod(PaymentMethod paymentMethod) {
       return paymentMethodValidationStrategy.validatePaymentMethod(paymentMethod);
    }

}
