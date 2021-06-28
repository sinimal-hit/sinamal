package com.doer.function;

import java.util.function.Supplier;

public class Demo04 {
    public static void main(String[] args) {
        Supplier<Integer> supplier = new Supplier() {
            @Override
            public Integer get() {
                System.out.println("get()");
                return 1024;
            }
        };
        System.out.println(supplier.get());
        Supplier<Integer> supplier1 = ()->{return 1023;};
        System.out.println(supplier1.get());

    }
}
