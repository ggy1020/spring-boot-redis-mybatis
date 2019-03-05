package com.demo.design.agency.img;

public class TestDemo {
    public static void main(String[] args) {
        Img image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
