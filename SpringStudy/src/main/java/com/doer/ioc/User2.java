package com.doer.ioc;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User2 {
    public User2(){
        System.out.println("User2已经被初始化了");
    }
    public User2(String name){
        this.name = name;
    }
    private String name;
    public void show(){
        System.out.println("name="+name);
    }

}
