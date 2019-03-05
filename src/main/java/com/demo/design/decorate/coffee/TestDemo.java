package com.demo.design.decorate.coffee;

public class TestDemo {
    public static void main(String[] args) {
        MoShiCoffee moShiCoffee = new MoShiCoffee();
        MilkCoffee milkCoffee = new MilkCoffee(moShiCoffee);
        ColeCoffee coleCoffee = new ColeCoffee(milkCoffee);
        System.out.println(coleCoffee.price());
    }
}
