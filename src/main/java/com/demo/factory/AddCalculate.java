package com.demo.factory;

public class AddCalculate implements Calculate {

    @Override
    public int accept(int num1,int num2) {
        return num1 + num2;
}
}
