package com.doer;

import com.doer.ioc.User;
import com.doer.ioc.User2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        User user = (User) context.getBean("user");
//        User user2 = (User) context.getBean("nihaoshijie");
//        user2.show();
//        System.out.println(user == user2);
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User2 user22 = (User2) context.getBean("user23");
        user22.show();
    }

}
