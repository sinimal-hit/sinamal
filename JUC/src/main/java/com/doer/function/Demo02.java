package com.doer.function;

import java.util.function.Predicate;

/**
 * Predicate 断定行接口,有一个输入参数,返回值只能是布尔值
 */
public class Demo02 {
    public static void main(String[] args) {
        Predicate<String> predicate =  new Predicate<String>() {
            //判断字符串是否为空
            @Override
            public boolean test(String str) {
                return str.isEmpty();
            }
        };
        System.out.println(predicate.test(""));

        //lambda表达式简化
        Predicate<String> predicate1 = (str)->{return str.isEmpty();};
        System.out.println(predicate1.test(""));
    }
}
