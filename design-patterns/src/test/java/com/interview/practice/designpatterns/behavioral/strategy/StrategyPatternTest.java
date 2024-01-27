package com.interview.practice.designpatterns.behavioral.strategy;

import com.interview.practice.designpatterns.behavioral.strategy.*;
import org.junit.jupiter.api.Test;

public class StrategyPatternTest {

    @Test
    public void testStrategy() {
        PaymentMethodValidationContext context = new PaymentMethodValidationContext(
                new PayPalValidationStrategy()
        );
        context.validatePaymentMethod(new PaymentMethod());
        context = new PaymentMethodValidationContext(
                new BankAccountValidationStrategy()
        );
        context.validatePaymentMethod(new PaymentMethod());

        context = new PaymentMethodValidationContext(
                new CreditCardValidationStrategy()
        );
        context.validatePaymentMethod(new PaymentMethod());
    }
}
