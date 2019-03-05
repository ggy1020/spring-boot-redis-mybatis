package com.demo.design.decorate.tea;

public abstract class Decorate extends Tea {

    protected Tea tea;

    public Decorate(Tea tea) {
        this.tea = tea;
    }

    @Override
    public  Double getPrice() {
        if (null !=tea){
            return tea.getPrice();
        }
        return null;
    }
}
