package com.doer.tvolatile;

/**
 * 指令重排序
 *
 */
public class Demo05 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        x = x + 5;
        y = x * x;

    }
}
