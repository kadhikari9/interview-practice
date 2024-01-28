package com.interview.practice.designpatterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyServer implements Internet {

    private final Internet realInternet = new RealInternet();
    private final List<String> bannedSites = new ArrayList<>();

    public ProxyServer() {
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lnm.com");
    }

    @Override
    public void connectTo(String host) {
        if (bannedSites.contains(host.toLowerCase())) {
            throw new RuntimeException("Access Denied");
        }

        realInternet.connectTo(host);
    }
}
