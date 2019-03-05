package com.demo.design.decorate.tea;

public class CaramelCoffee extends Tea {

    public CaramelCoffee(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    @Override
    public Double getPrice() {
        System.out.println("焦糖奶茶15元一杯");
        return 15.0;
    }
}
