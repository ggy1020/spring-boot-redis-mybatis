package com.demo.design.observer.eventbus;


import java.util.concurrent.Executor;

//订阅者模式-----时间驱动方式
public class AsyncEventBus extends EventBus {
    public AsyncEventBus(Executor executor) {
        super(executor);
    }
}
