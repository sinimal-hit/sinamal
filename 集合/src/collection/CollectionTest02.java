package collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
集合遍历/迭代专题(重点)
 */
public class CollectionTest02 {
    public static void main(String[] args) {
        //以下的遍历方式,是所有Collection中通用的一种方式.
        //在Map中不能使用,
        Collection c = new HashSet();
        c.add("abc");
        c.add("def");
        c.add("100");
        c.add(new Object());
        //对集合Collection进行遍历/迭代
        //第一步:获取集合对象的迭代器对象Iterator
        Iterator it = c.iterator();
        //第二步:通过以上获取的迭代器对象开始迭代/遍历集合
        /*
        以下两个方法是迭代器中Iterator中的方法
            boolean hasNext()
                    如果迭代具有更多元素，则返回 true 。  返回true表示没有更多的元素可以迭代了
            Object next()
                    返回迭代中的下一个元素。  这个方法是让迭代器前进以为,并且将指向的元素返回(拿到)
         */
        /*
        boolean hasNext = it.hasNext();
        System.out.println(hasNext);
        if(hasNext){
            Object obj = it.next();
            System.out.println(obj);
        }

        hasNext = it.hasNext();
        System.out.println(hasNext);
        if(hasNext){
            Object obj = it.next();
            System.out.println(obj);
        }

        hasNext = it.hasNext();
        System.out.println(hasNext);
        if(hasNext){
            Object obj = it.next();
            System.out.println(obj);
        }

        hasNext = it.hasNext();
        System.out.println(hasNext);
        if(hasNext){
            Object obj = it.next();
            System.out.println(obj);
        }

        hasNext = it.hasNext();
        System.out.println(hasNext);
        if(hasNext){
            Object obj = it.next();
            System.out.println(obj);
        }

         */
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
