package com.demo.arithmetic;

/**
 * 计算1！ + 2！ + 3！
  */
public class Factorial {

    public static void main(String[] args) {
        int sum = 1 ;
        for (int i = 0 ; i < 11 ; i ++){
            sum += sum * i;
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
