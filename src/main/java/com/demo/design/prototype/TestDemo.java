package com.demo.design.prototype;

import java.util.ArrayList;

public class TestDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setId("222");
        person.setName("ddfff");
        ArrayList<Object> objects = new ArrayList<>();
        objects.add("2333");
        person.setList(objects);
        Person person1 = person.clone();
        person1.getList().add("00");//修改复制之后的结果
        System.out.println(person.getList());
        System.out.println(person1.getList());
    }
}
