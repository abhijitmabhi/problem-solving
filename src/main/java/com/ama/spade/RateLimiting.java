package com.ama.spade;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RateLimiting {
    private static final int MAX_REQUEST_PER_MINUTE = 100;
    private static final long MINUTES_IN_MILLIS = 60000;

    private final Map<String, RequestWindow> windowMap = new ConcurrentHashMap<>();

    public boolean isAllowed(String clientId) {
        long currentTime = System.currentTimeMillis();

        RequestWindow requestWindow = windowMap.computeIfAbsent(clientId, k -> new RequestWindow(currentTime, 0));

        synchronized (requestWindow) {
            if (currentTime - requestWindow.startWindow >= MINUTES_IN_MILLIS) {
                windowMap.put(clientId, new RequestWindow(currentTime, 1));
                return true;
            } else {
                if (requestWindow.count < MAX_REQUEST_PER_MINUTE) {
                    requestWindow.count++;
                    return true;
                } else {
                    return false;
                }
            }
        }

    }

    static class RequestWindow {
        long startWindow;
        int count;

        RequestWindow(long startWindow, int count) {
            this.startWindow = startWindow;
            this.count = count;
        }
    }
}
