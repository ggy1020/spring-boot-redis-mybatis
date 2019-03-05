package com.demo.design.agency.dao;

//静态代理
public class UserDaoProxy implements IUserDao {
    private UserDaoTarget userDaoTarget;
    public UserDaoProxy(){
        this.userDaoTarget = new UserDaoTarget();
    }

    @Override
    public void save() {
        System.out.println("静态代理下的");
        this.userDaoTarget.save();
    }

    @Override
    public int delete() {
        System.out.println("静态代理");
        return 0;
    }
}
