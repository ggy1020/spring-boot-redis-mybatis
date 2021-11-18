package com.demo.arithmetic;

import static javafx.scene.input.KeyCode.L;

public class Code_20210823 {

    public static void main(String[] args) {
       int[] arr = {10,5,6,4,7,8,2,4,6,2-5};
        int[] ints = newSumArr(arr);
        System.out.println(subLR(ints,1,5));
        System.out.println("===============================");

        double x = 0.75;
        int count = 0 ;
        for (int i = 1; i < 10000; i++) {
            double random = Math.random();
            if (random < x){
                count ++;
            }
        }
        System.out.println((double)count/10000);
        System.out.println("=================================");

        x = 0.6;
        count = 0 ;
        for (int i = 1; i < 10000; i++) {
            double random = xToXPower2();
            if (random < x){
                count ++;
            }
        }
        System.out.println((double)count/10000);
        System.out.println("=================================");

        x = 2;
        count = 0 ;
        for (int i = 1; i < 10000; i++) {
            int random = f3Wei();
            if (random < x){
                count ++;
            }
        }
        System.out.println((double)count/10000);
        System.out.println("=================================");

        x = 20;
        count = 0 ;
        for (int i = 1; i < 10000; i++) {
            int random = f333WeiNew();
            if (random < x){
                count ++;
            }
        }
        System.out.println((double)count/10000);
        System.out.println("=================================");

    }

    /**
     * 17-56
     * @return
     */
    public static int f333WeiNew(){
        int ans = 0;
        do {
            ans = f333Wei();
        } while (ans > 39);
        return ans + 17;
    }

    /**
     * 000 - 111111 等概率
     * @return
     */
    public static int f333Wei(){
        return ((f20Or1() << 5 )+ (f20Or1() << 4) +(f20Or1() << 3 )+(f20Or1() << 2 )+ (f20Or1() << 1) +f20Or1());
    }


    //获取0或1
    public static int f2220Or1(){
        int ans = 0;
        do {
            ans = f1TO5();
        } while (ans == 11);
        return ans < 11 ? 0 : 1;
    }

    /**
     * 随机数1-5个数，固定函数，然后另外一个函数返回结果是1-7
     */
    public static int f003TO19(){
        return ((int)(Math.random()*17) + 3);
    }

    /**
     * 000 - 111 等概率
     * @return
     */
    public static int f3Wei(){
        return ((f20Or1() << 2 )+ (f20Or1() << 1) +f20Or1());
    }

    //获取0或1
    public static int f20Or1(){
        int ans = 0;
        do {
            ans = f1TO5();
        } while (ans == 3);
        return ans < 3 ? 0 : 1;
    }

    /**
     * 随机数1-5个数，固定函数，然后另外一个函数返回结果是1-7
     */
    public static int f1TO5(){
        return ((int)(Math.random()*5) + 1);
    }

    /**
     * 计算x的平方
     * @return
     */
    public static double xToXPower2(){
        return Math.max(Math.random(),Math.random());
    }

    /**
     * 组装一个新集合集合存放前面几项之和
     */
    public static int[] newSumArr(int[] arr){
        if (arr.length < 2){
            return arr;
        }
        int[] sumArr = new int[arr.length];
        sumArr [0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sumArr[i] = sumArr[i-1] + arr[i];
        }
        return sumArr;
    }

    /**
     * 计算L-R直接的累计之和 快速获取
     */
    public static int subLR(int[] arr,int l ,int r){
        if (arr.length < 2){
            return arr[0];
        }
        return arr[r] - arr[l-1];
    }
}
