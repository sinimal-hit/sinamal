package com.doer.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//等价于<bean id="user" class="com.doer.dao.User"/>
@Service
public class User {
    //等价于<property name="name" value="朵儿"/>
    @Value("朵儿")
    public String name;
}
