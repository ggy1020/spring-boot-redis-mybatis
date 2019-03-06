package com.demo.design.prototype;

import java.util.ArrayList;
import java.util.List;

//如果要克隆就必须实现Cloneable接口  Cloneable表示表示可以进行clone
public class Person implements Cloneable{
    private String id;

    private String name;

    private List<Object> list;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    @Override
    public Person clone(){
        try {
            Person person = (Person) super.clone();
            List<Object> arrayList = new ArrayList<>();
            for (Object obj:this.getList()) { //这里重新放入一次引入对象的数据，不然复制之后的对象的引入参数为空
                arrayList.add(obj);
            }
            person.setList(arrayList);
            return person;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
