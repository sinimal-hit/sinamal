package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map集合的遍历[非常重要]
    第一种方式:获取所有的key,通过遍历key,来遍历value
        Set<K> keySet()     获取Map集合所有的key(所有的键是一个set集合)
 */
public class MapTest02 {
    public static void main(String[] args) {


        //第一种方式:获取所有的key,通过遍历key,来遍历value
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"zhangsan");
        map.put(2,"lisi");
        map.put(3,"wangwu");
        map.put(4,"zhaoliu");

        //遍历Map集合
        //获取所有的key:所有的key是一个Set集合
        Set<Integer> keys =map.keySet();


        //遍历key,通过key过去value [迭代器的方式]
        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()){
            //取出一个key
            Integer key = it.next();

            //通过key获取value
            String value = map.get(key);
            System.out.println(key + "=" +value);
        }

        //[foreach的方式]
        for(Integer key : keys){
            System.out.println(key + "=" + map.get(key));
        }
    }
}
