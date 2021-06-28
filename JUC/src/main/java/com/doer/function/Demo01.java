package com.doer.function;

import java.util.function.Function;

/**
 * Function 函数式接口,有一个输入参数,有一个输出参数
 * 只要是函数式接口,就可以用lambda表达式简化
 */
public class Demo01 {
    public static void main(String[] args) {
        /*
        @FunctionalInterface
        public interface Function<T, R> {
            R apply(T t);
         */
       Function function =  new Function<String, String>() {
            @Override
            public String apply(String str) {

                return str;
            }
        } ;
        System.out.println(function.apply("asd"));

        //lambda表达式简化
        Function<String,String> function1 = (str)->{return str;};
        System.out.println(function1.apply("4546"));
    }
}
