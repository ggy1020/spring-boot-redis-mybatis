package com.demo.design.decorate.coffee;

public class  Decorate implements Coffee{
    protected Coffee coffee;



    public Decorate(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public Double price() {

        return this.coffee.price();
    }
}
