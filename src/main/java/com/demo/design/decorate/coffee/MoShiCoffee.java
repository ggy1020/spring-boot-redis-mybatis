package com.demo.design.decorate.coffee;

public class MoShiCoffee implements Coffee{

    @Override
    public Double price() {
        double price = 10.05;
        return price;
    }


}
