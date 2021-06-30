package com.doer.pojo;

import lombok.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Data
@Component
public class People {
    @Autowired
    //@Qualifier(value = "cat2")
    private Cat cat;
    @Autowired
   // @Qualifier(value = "dog1")

    private Dog dog;

    @Value("java小白")
    private String name;
}
