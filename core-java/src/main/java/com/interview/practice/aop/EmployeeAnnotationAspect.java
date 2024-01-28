package com.interview.practice.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Before;

@Slf4j
public class EmployeeAnnotationAspect {

    @Before("@annotation(com.interview.practice.Loggable)")
    public void myAdvice() {
        log.info("Executing myAdvice!!");
    }
}
