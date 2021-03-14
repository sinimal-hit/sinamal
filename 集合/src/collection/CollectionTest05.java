package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
关于集合元素的remove
    重点:当集合结构发生改变时,迭代器必须重新获取,如果还用以前老的迭代器,会出现异常
        异常:java.util.ConcurrentModificationException

        在迭代集合的过程中,不能使用集合对象的remove()方法,删除元素之后,集合的结构发生了改变,调用next()方法就会发生异常
 */
public class CollectionTest05 {
    public static void main(String[] args) {

        Collection c = new ArrayList();
        /*
         注意:此时获取的迭代器,指向的是集合中没有元素状态下的迭代器
        一定要注意,集合结构只要发生改变,迭代器就必须要重新获取.
        当集合结构发生改变之后,迭代器没有重新获取时,调用next()方法时:java.util.ConcurrentModificationException
        Iterator it = c.iterator();
         */

        c.add(1);
        c.add(2);
        c.add(3);
        //获取迭代器
        Iterator it = c.iterator();
        while(it.hasNext()){
            //编写代码时,next()方法返回值类型必须是Object
            Object obj = it.next();

            //删除元素
            //删除元素之后,集合的结构发生了变化,应该重新去获取迭代器,
            //但是,循环下一次的时候并没有重新获取迭代器,所以会出现异常
            //c.remove(obj);

            //使用迭代器删除
            it.remove();
            System.out.println(obj);

        }
        System.out.println(c.size());//0
    }
}
