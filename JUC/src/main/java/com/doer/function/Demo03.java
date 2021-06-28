package com.doer.function;

import java.util.function.Consumer;

/**
 * Consumer 消费性接口,只有输入,没有返回值
 */
public class Demo03 {
    public static void main(String[] args) {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("jsaij");


    }

}
