package Map;

import HashSet.HashSetTest01;

import java.util.HashSet;
import java.util.Set;

public class 静态内部类 {

    //静态内部类
    private static class InnerClass{

        //静态方法
        public static void mi(){
            System.out.println("静态内部类吗m1方法执行");
        }

        //实例方法
        public void m2(){
            System.out.println("静态内部类中的实例方法执行");
        }
    }

    public static void main(String[] args) {
        静态内部类.InnerClass.mi();

        //创建静态内部类对象
        静态内部类.InnerClass m = new 静态内部类.InnerClass();
        m.m2();

        //给一个Set集合
        //该集合存储的对象是:静态内部类.InnerClass类型
        Set<InnerClass> set = new HashSet<>();

        //这个Set集合存储的是String对象
        Set<String> stringSet = new HashSet<>();
    }
}
