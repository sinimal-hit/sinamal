package com.doer.ioc;

import lombok.Getter;
import lombok.Setter;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Getter
@Setter
public class User {
    public User(String name){
        this.name = name;
    }
    private String name;
    public void show(){
        System.out.println("name="+name);
    }


}
