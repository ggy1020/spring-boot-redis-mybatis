package com.demo.design.observer;

import com.demo.design.observer.eventbus.AsyncEventBus;

import java.util.concurrent.Executors;

//测试事件驱动情况下的观察者模式
public class DemoTest {
    public static void main(String[] args) {
        AsyncEventBus asyncEventBus = new AsyncEventBus(Executors.newFixedThreadPool(3));
        RegNotificationObserver regNotificationObserver = new RegNotificationObserver();
        RegPromotionObserver regPromotionObserver = new RegPromotionObserver();
        RegPromotionObserver regPromotionObserver1 = new RegPromotionObserver();
        RegPromotionObserver regPromotionObserver2 = new RegPromotionObserver();
        RegPromotionObserver regPromotionObserver3 = new RegPromotionObserver();
        asyncEventBus.register(regNotificationObserver);
        asyncEventBus.register(regPromotionObserver);
        asyncEventBus.register(regPromotionObserver1);
        asyncEventBus.register(regPromotionObserver2);
        asyncEventBus.register(regPromotionObserver3);
        asyncEventBus.post("74389");

    }
}
