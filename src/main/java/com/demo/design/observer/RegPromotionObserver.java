package com.demo.design.observer;

import com.demo.design.observer.eventbus.Subscribe;

public class RegPromotionObserver {


    @Subscribe
    public void handleRegSuccess(String userId) {
        System.out.println("========================RegPromotionObserver"+userId);
    }
}
