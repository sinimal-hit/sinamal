package com.doer.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//用这个类总动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

//    Foo f = (Foo) proxyClass.getConstructor(InvocationHandler.class).
//            newInstance(handler);

    //被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成得到的代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);

    }

    //处理代理实例,并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //动态代理的本质就是使用反射机制实现的
        Object result = method.invoke(rent,args);
        return result;
    }
}
