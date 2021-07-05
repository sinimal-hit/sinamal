package com.doer.domo04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //生成代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);

    }


    /**
     *  这个方法就是代理类将要处理的实例,该实例是被invoke方法进行调用处理,处理的对象是target,也就是
     *  处理的是target引用指向的对象
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object invoke = method.invoke(target, args);
        return invoke;

    }
    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }
}
