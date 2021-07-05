package com.doer.demo02;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.add(); //输出增加了一个用户
        /*如果业务要求需要增加一个需求,在调用方法的时候添加日志信息
        如果在原有的UserServiceImpl类中进行方法的增加,本就是原有的大忌
        还需要需要确保兼容性问题,也就是不改变原有的代码的前提改进业务代码, 这就是横切,详见画图板,面向切面编程

         */

        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserService(userService);
        userServiceProxy.add();
    }
}
