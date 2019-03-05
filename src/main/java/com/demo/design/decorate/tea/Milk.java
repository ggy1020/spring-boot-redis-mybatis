package com.demo.design.decorate.tea;

public class Milk extends Decorate {
    public Milk(Tea tea) {
        super(tea);
    }

    public  Double getPrice() {
        System.out.println("加牛奶 2.13元");
        return this.tea.getPrice() + 2.13;
    }

    public  String detail(){
        return tea.name+tea.tel+"一共花费了"+this.getPrice().toString();
    }
}
