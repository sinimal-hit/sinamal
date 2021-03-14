package collection;

import java.util.ArrayList;
import java.util.Collection;

/*
深入Collection集合的contains()方法
    boolean     contains(Object o)      判断当前中是否包含元素o
    包含返回true; ,不包含返回false


 */
public class CollectionTest04 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        String s1 = new String("abc");
        c.add(s1);
        String s2 = new String("def");
        c.add(s2);

        System.out.println("元素的个数是:"+c.size());

        String x = new String("abc");
        /**
         * 为什么是true?
         *  因为contains()方法底层调用了equals()方法,String类已经重写了equals方法,比较的是字符串的内容
         *
         *
         *
         */
        System.out.println(c.contains(x));//true



    }
}
