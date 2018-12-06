package com.demo.autoFile;

import org.springframework.stereotype.Component;

public class TestContextBean {

    private String content;

    public TestContextBean(String content){
        super();
        this.content =  content;
    }

    public  String getContent(){
        return this.content;
    }

    public void setContent(String content){
        this.content = content;
    }
}
