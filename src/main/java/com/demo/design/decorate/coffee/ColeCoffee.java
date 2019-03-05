package com.demo.design.decorate.coffee;

public class ColeCoffee extends Decorate {


    public ColeCoffee(Coffee coffee) {
        super(coffee);
    }
    public Double price() {
        System.out.println("增加可乐的咖啡");
        return this.coffee.price() + 5.12;
    }

}
