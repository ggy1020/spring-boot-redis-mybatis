package com.demo.demo;

public class EnumDemo {
    public static void main(String[] args) {
        getEnum(GradeEnum.PRIMARY);
    }

    public static String getEnum(GradeEnum gradeEnum){
       switch (gradeEnum){
           case PRIMARY:
               System.out.println(gradeEnum.getDescp());
               break;
            default:
                System.out.println("=======");
       }
        return "";
    }
}
