package com.doer.config;

import com.doer.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//这个也会被Spring容器托管,因为它本身就是一个@Component,
//@Configuration代表这是一个配置类,就和我们之前看的beans.xml
public class DoerConfig {

    //注册一个bean,就相当于我们之前写的一个bean标签,这个方法的名字就相当于bean标签中的id属性,
    //这个方法的返回值就是bean标签中class属性
    @Bean
    public User user() {
        return new User();
    }
}
