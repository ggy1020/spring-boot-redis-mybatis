package com.demo.design.agency.dao;

public class UserDaoTarget implements IUserDao {
    @Override
    public void save() {
        System.out.println("我要被保存了");
    }

    @Override
    public int delete() {
        System.out.println("快把我删了吧");
        return 0;
    }
}
