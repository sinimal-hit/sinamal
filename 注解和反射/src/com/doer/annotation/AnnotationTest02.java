package com.doer.annotation;

import java.lang.annotation.*;

//测试元注解
public class AnnotationTest02 {
}

/**
 * 定义一个注解
 * Target 表示我们的注解可以用在什么地方
 */
@Target(value = {ElementType.METHOD,ElementType.TYPE})


/**
 * 表示我们的注解在什么地方还有效
 * runtime > class > sources
 */
@Retention(value = RetentionPolicy.RUNTIME)

/**
 * Documented表示是否将我们的注解生成在JAVAdoc中
 */
@Documented

/**
 * Inherited子类可以继承夫类的注解
 */
@Inherited

@interface MyAnnotation{

}
