package com.doer.domo04;

import com.doer.demo02.UserService;
import com.doer.demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();

        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        pih.setTarget(userService);
        UserService proxy = (UserService) pih.getProxy();
        proxy.add();
    }
}
