package com.demo.design.decorate.tea;

public class Pearl extends Decorate {
    public Pearl(Tea tea) {
        super(tea);
    }

    public  Double getPrice() {
        System.out.println("加珍珠 2元");
        return this.tea.getPrice()+2.0;
    }
}
