package com.doer;

import java.util.Random;

//模仿堆内存溢出java.lang.OutOfMemoryError: Java heap space
public class HeapTest {
    public static void main(String[] args) {
        String s = "doer";
        while (true){

            s += s + new Random().nextInt(800000000);
        }
    }
}
