package com.demo.design.agency.dao;

public class TestApp {
    public static void main(String[] args) {
        //静态代理
      /*  UserDaoProxy userDaoProxy = new UserDaoProxy();
        userDaoProxy.save();*/
      //动态代理
        // 目标对象

        //目标对象
        UserDao target1 = new UserDao();

        //代理对象
        UserDao proxy1 = (UserDao)new CglibProxyFactory(target1).getProxyInstance();

        //执行代理对象的方法
        proxy1.save();





        IUserDao target = new UserDaoTarget();
        // 【原始的类型 class cn.itcast.b_dynamic.UserDao】
        System.out.println(target.getClass());
        // 给目标对象，创建代理对象
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        // class $Proxy0   内存中动态生成的代理对象
        System.out.println(proxy.getClass());

        // 执行方法   【代理对象】
        proxy.save();
        proxy.delete();
    }
}
