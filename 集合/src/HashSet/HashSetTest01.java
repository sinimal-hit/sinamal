package HashSet;

import java.util.HashSet;
import java.util.Set;

/*
HashSet集合:
    无序不可重复.
 */
public class HashSetTest01 {
    public static void main(String[] args) {
        //演示一下HashSet集合特点
        Set<String> stringSet = new HashSet<>();
        //添加元素
        stringSet.add("hello3");
        stringSet.add("hello2");
        stringSet.add("hello5");
        stringSet.add("hello1");
        stringSet.add("hello3");
        stringSet.add("hello0");

        //遍历
        /**
         * hello0
         * hello1
         * hello5
         * hello2
         * hello3
         *
         * 1,存储时顺序和去除的顺序不同.
         * 2,不可重复
         * 3,放到HashSet集合中的元素实际上是放到HashMap集合当中的
         */
        for(String s : stringSet){
            System.out.println(s);
        }
    }
}
