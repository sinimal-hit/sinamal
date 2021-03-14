package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
关于集合的迭代/遍历
 */
public class CollectionTest03 {
    public static void main(String[] args) {

        //创建ArrayList集合
        Collection c1 = new ArrayList();//ArrayList集合:有序可重复
        //添加元素
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);
        c1.add(1);

        //迭代集合
        Iterator it = c1.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        //创建HashSet集合
        Collection c2 = new HashSet();
        //无序:存进去和取出来的顺序不应顶相同,
        //不可重复:存储100,不能再存储100
        c2.add(100);
        c2.add(200);
        c2.add(300);
        c2.add(90);
        c2.add(400);
        c2.add(50);
        c2.add(100);

        Iterator it2 = c2.iterator();
        while ((it2.hasNext())){
            System.out.println(it2.next());
        }

    }
}
