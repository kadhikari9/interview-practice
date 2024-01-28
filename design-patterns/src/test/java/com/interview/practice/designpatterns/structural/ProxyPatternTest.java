package com.interview.practice.designpatterns.structural;

import com.interview.practice.designpatterns.structural.proxy.Internet;
import com.interview.practice.designpatterns.structural.proxy.ProxyServer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProxyPatternTest {

    @Test
    public void testProxy() {
        Internet proxy = new ProxyServer();
        proxy.connectTo("geeksforgeeks.org");

        Assertions.assertThrows(RuntimeException.class, () -> proxy.connectTo("abc.com"));
    }
}
