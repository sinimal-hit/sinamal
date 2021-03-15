package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
java.util.Collection集合接口
java.util.Collections集合工具类,方便集合的操作
 */
public class CollectionsTest {
    public static void main(String[] args) {
        //ArrayList集合是线程不安全的
        List<String> list = new ArrayList<>();

        //编程线程安全的
        Collections.synchronizedList(list);

        //排序
        list.add("abf");
        list.add("abc");
        list.add("abe");
        Collections.sort(list);
        for(String s:list){
            System.out.println(s);
        }
    }
}
