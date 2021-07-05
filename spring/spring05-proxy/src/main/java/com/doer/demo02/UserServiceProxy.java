package com.doer.demo02;

/**
 * 增加新的代理,在不改变原有代码的基础上新增添业务功能,
 */
public class UserServiceProxy implements UserService{
    private UserServiceImpl userService;
    public void setUserService(UserServiceImpl userService){
        this.userService = userService;
    }

    public void log(){
        System.out.println("新增添的业务功能执行");
    }
    public void add() {
        log();
        userService.add();
    }

    public void delete() {
        log();
        userService.delete();
    }

    public void update() {
        log();
        userService.update();
    }

    public void query() {
        log();
        userService.query();
    }
}
