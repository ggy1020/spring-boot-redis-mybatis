package com.demo.design.decorate.coffee;

public class MilkCoffee extends Decorate  {
    public MilkCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public Double price() {
        System.out.println("咖啡加牛奶");
        return this.coffee.price()+3.02;
    }
}
