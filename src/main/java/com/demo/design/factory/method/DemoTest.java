package com.demo.design.factory.method;

public class DemoTest {

    public static void main(String[] args) {
        IFactory factory = new UndergraduateFactory();
        LeiFeng leiFeng = factory.createLeiFeng();
        leiFeng.BuyRice();
        leiFeng.Sweep();
        leiFeng.Wash();
    }
}
