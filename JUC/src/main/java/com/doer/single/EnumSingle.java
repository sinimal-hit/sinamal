package com.doer.single;

import java.lang.annotation.ElementType;

/**
 * 枚举本身也是一个类
 */
public enum  EnumSingle {
    INSTANCE;
    public EnumSingle getInstance(){
        return INSTANCE;
    }
}

class Test{

    public static void main(String[] args) {
        EnumSingle instance1 = EnumSingle.INSTANCE;
        EnumSingle instance2 = EnumSingle.INSTANCE;
        System.out.println(instance1 == instance2);

    }
}
