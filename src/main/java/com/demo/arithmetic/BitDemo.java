package com.demo.arithmetic;

public class BitDemo {

    /** 位运算，有一个符号位 就是为了取反 底层走一个逻辑提高效率
     * i 表示左移几位
     * 负数表示负数的二进制 数 + 1
     * 所有最小数 + 1 和 0 还是他本身
     * @param num
     */
    public static void print(int num){
        for (int i = 31; i>=0; i--){
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
    }

    public static void main(String[] args) {
        int b = 0;
        int c = - b;
        //相反数取反加  1
        int d = (~b + 1);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        int a  = -6 ;
        print(~ a);
        System.out.println();
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        //不带符号右移
        print(Integer.MIN_VALUE >> 1);
        System.out.println();
        //带符号右移
        print(Integer.MIN_VALUE >>> 1);
    }


}
