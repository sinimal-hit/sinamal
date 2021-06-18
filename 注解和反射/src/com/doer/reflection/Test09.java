package com.doer.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//动态的创建对象,通过反射
public class Test09 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //获得Class对象
        Class c1 = User.class;
        //Class c1 = Class.forName("com.doer.reflection.User");

        //构造一个对象
        User user =(User) c1.newInstance();//本质调的是无参构造器
        System.out.println(user);
        //User{id=0, age=0}

        //通过构造器创建对象
        Constructor declaredConstructor = c1.getDeclaredConstructor(int.class, int.class);
        User user1 = (User) declaredConstructor.newInstance(001, 18);
        System.out.println(user1);
        //User{id=1, age=18}

        //通过反射调用普通方法
        User user2 = (User)c1.newInstance();
        //通过反射获取一个方法
        Method setId = c1.getDeclaredMethod("setId", int.class);
        /*
        invoke :激活的意思
        (对象,"方法的值")
         */
        setId.invoke(user2,007);
        System.out.println(user2.getId());


        //通过反射操作属性
        User user3 = (User)c1.newInstance();
        Field id = c1.getDeclaredField("id");
        /*
        不能直接操作私有属性,我们需要关闭程序的安全检测,属性或者方法的setAccessible(true)
         */
        id.setAccessible(true);
        id.set(user3,90);
        System.out.println(user3.getId());
    }
}
