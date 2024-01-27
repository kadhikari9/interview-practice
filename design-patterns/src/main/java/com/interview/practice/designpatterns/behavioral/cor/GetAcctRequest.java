package com.interview.practice.designpatterns.behavioral.cor;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class GetAcctRequest {

    private String acctNum;
    private String custNum;

}
