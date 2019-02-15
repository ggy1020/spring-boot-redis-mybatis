package com.demo.factory;

//减法
public class ReduceCalculate implements Calculate{

    @Override
    public int accept(int num1, int num2) {
        return num1 - num2;
    }
}
