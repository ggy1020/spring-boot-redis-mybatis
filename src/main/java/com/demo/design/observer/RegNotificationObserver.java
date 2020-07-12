package com.demo.design.observer;

import com.demo.design.observer.eventbus.Subscribe;

public class RegNotificationObserver {
    @Subscribe
    public void handleRegSuccess(String userId) {
        System.out.println("=========RegNotificationObserver"+userId);
    }

    @Subscribe
    public void handleRegSuccess2(String userId) {
        System.out.println("=========RegNotificationObserver2"+userId);
    }
}
