package com.demo.controller;

public class Demo {
    public static void main(String[] args) {
        int count = 10000;
        double sum =0.0f;
        for (int i=1;i<=12;i++) {
            double v = 75 / (count - i * 908.33);
            sum +=v;
        }
        System.out.println(sum/12);
    }
}
