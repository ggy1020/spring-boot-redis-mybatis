package com.demo.factory;

//乘法
public class MultiplyCalculate implements Calculate {

    @Override
    public int accept(int num1, int num2) {
        return num1*num2;
    }
}
