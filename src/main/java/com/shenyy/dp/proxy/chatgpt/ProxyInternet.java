package com.shenyy.dp.proxy.chatgpt;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    private Internet internet = new RealInternet();

    private static List<String> bannedSites = new ArrayList<>();

    static {
        bannedSites.add("facebook.com");
        bannedSites.add("google.com");
    }

    @Override
    public void connectTo(String serverHost) throws Exception {
        if (bannedSites.contains(serverHost)) {
            throw new Exception("Access Denied");
        }

        internet.connectTo(serverHost);
    }
}
