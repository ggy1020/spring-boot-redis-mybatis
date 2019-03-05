package com.demo.design.decorate.tea;

public class Sugar extends Decorate {

    public Sugar(Tea tea) {
        super(tea);
    }

    public  Double getPrice() {
        System.out.println("加糖0.5元");
        return this.tea.getPrice()+0.5;
    }

}
