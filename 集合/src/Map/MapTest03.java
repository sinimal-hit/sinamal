package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
遍历集合Map
    第二种方式
        Set<Map.Entry<K,V>> entrySet()  将Map集合转成Set集合
 */
public class MapTest03 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"zhangsan");
        map.put(2,"lisi");
        map.put(3,"wangwu");
        map.put(4,"zhaoliu");


        //第二种遍历方式
        //Set<Map.Entry<K,V>> entrySet(),是把Map集合直接全部转换成Set集合,Set集合的类型是:Map.Entry
        Set<Map.Entry<Integer,String>> set = map.entrySet();

        //遍历Set集合每次取出一个Node

        //迭代器
        Iterator<Map.Entry<Integer,String >> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<Integer,String> node = it.next();
            Integer key = node.getKey();
            String value = node.getValue();
            System.out.println(key + "=" + value);
        }

        //foreach
        //这种方式效率比较高,因为获取key和value都是直接从node对象中获取的属性值
        //这种方式比较适合于大数据量
        for(Map.Entry<Integer,String> node : set){
            System.out.println(node.getKey() + "---->" + node.getValue());
        }
    }
}
