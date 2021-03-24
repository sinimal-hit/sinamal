package vector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

/*
Vector
    1,底层也是一个数组
    2,初始化容量:10
    3,怎么扩容的?
        扩容之后是原容量的二倍;
    4,Vector 所有的方法都是线程同步的,都带有synchronized关键字,是线程安全的,效率比较低,使用较少了
    5,怎么讲一个线程不安全的的ArrayList集合转换成集合安全的呢?
        使用集合工具类:
            java.util.Collections

            java.util,Collection是集合接口
            java.util.Collections是集合工具类.

 */
public class VectorTest {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);


        vector.add(11);

        //这个以后可能要使用
        List myList = new ArrayList();//非线程安全的
        //变成线程安全的
        Collections.synchronizedList(myList);//这里没有办法看效果多线程还未学习.
        myList.add("111");
        myList.add("222");
        myList.add("333");
    }
}
