package com.doer.service;

import com.doer.dao.CUserDaoImpl;
import com.doer.dao.UserDao;
import com.doer.dao.JavaUserDaoImpl;

public class UserServiceImpl implements UserService{

    //存在一个根本性的问题,如果用户的需求发生改变需要改变原有的代码,这样的代码程序耦合程度太高,适应不了用户的变更
    //能不能解决这个问题?我们的程序不发生变更的前提下,让客户自己去做一些事情进行调用

    //private UserDao userDao = new CUserDaoImpl();
    //这种方式是程序控制的对象,对象已经写死,客户新增业务,则需要更改代码


    private UserDao userDao;
    //利用set
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
