package com.doer.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 滴定仪注解
 */
public class AnnotationTest03 {
    //注解可以显示赋值,如果没有默认值就要给注解赋值
    @MyAnnotation2(age = 18,name = "doer")
    public void test(){

    }
    @MyAnnotation3("世界")
    public void test2(){};
}

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
    //注解的参数: 参数类型+参数名();
    String name() default "";
    int age() ;
    int id() default -1;//如果默认值为-1,代表不存在

    String [] schools() default {"西安工业大学","清华大学"};
}
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3{
    String value();
}