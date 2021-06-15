package com.doer.annotation;

import java.util.ArrayList;
import java.util.List;

/**
 * 什么是注解
 */
public class AnnotationTest01 {

    //Override 重写的注解
    @Override
    public String toString() {
        return super.toString();
    }

    //Deprecated 不推荐程序员使用,但是可以使用,或者存在更好的方式
    @Deprecated
    public static void test(){
        System.out.println("Deprecated");
    }

    //SuppressWarnings将警告镇压,如果不加这个注解,这里创建了一个List但是没有被调用,引用会显示黑色,
    @SuppressWarnings("all")
    public void test02(){
        List<String > list = new ArrayList<>();
    }

    public static void main(String[] args) {
        test();
    }
}
