package com.demo.design.decorate.tea;

public class TeaDemo {
    public static void main(String[] args) {
        SeasonsTea seasonsTea = new SeasonsTea("小米","145623111");
        Milk milk = new Milk(seasonsTea);
        Pearl pearl = new Pearl(milk);
        System.out.println(milk.detail());
    }
}
