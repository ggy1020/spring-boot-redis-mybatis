package com.demo.demo;

import com.baomidou.mybatisplus.annotation.EnumValue;

public enum  GradeEnum {
    PRIMARY(1, "小学"),  SECONDORY(2, "中学"),  HIGH(3, "高中");
    GradeEnum(int code, String descp) {
        this.code = code;
        this.descp = descp;
    }

   //标记数据库存的值是code
    private final int code;
    private final String descp;

    public int getCode() {
        return code;
    }

    public String getDescp() {
        return descp;
    }
}