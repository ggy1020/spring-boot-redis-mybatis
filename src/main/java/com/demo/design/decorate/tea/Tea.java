package com.demo.design.decorate.tea;

public abstract class Tea {
    protected String name;
    protected String tel;

    //描述
    public  String detail(){
        return this.name+this.tel+"一共花费了"+this.getPrice().toString();
    }

    public abstract Double getPrice();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
