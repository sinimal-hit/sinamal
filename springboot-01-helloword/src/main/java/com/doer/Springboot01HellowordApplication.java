package com.doer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //该注解表示这个类是一个springboot的应用
public class Springboot01HellowordApplication {

    public static void main(String[] args) {
        //将springboot应用启动,通过反射加载这个类的对象启动
        SpringApplication.run(Springboot01HellowordApplication.class, args);
    }

}
