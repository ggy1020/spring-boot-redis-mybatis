package com.demo.design.decorate.tea;

public class SeasonsTea extends Tea {

    public SeasonsTea(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    @Override
    public Double getPrice() {
        System.out.println("四季奶青价格为8.0元");
        return 8.0;
    }
}
