package Map;

import org.omg.CORBA.INTERNAL;

import java.util.*;

public class MyTest {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"123");
        map1.put(2,"3242");
        map1.put(3,"sa");

        Set<Integer> keys = map1.keySet();
        for(Integer k : keys){
            System.out.println(k+"----->"+ map1.get(k));
        }
        Set<Map.Entry<Integer,String >> nodes =  map1.entrySet();
        for(Map.Entry<Integer,String> node : nodes){
            System.out.println(node.getKey() + "=" + node.getValue());
        }

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"hello");
        map.put(2,"beautiful");
        map.put(3,"doer");
        map.put(4,"girl");
        map.put(5,"boy");

        //获取value
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println("============================");

        //通过values() 方法获取所有的值
        Collection<String> value = map.values();
        for(String s : value){
            System.out.println(s);
        }
        System.out.println("========================");
        Iterator<String> it = value.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("=======================");

        //通过keySet()来遍历,这种方式是获取所有的key值,通过key来遍历value
        Set<Integer> set = map.keySet();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            Integer key = iterator.next();
            String value1 = map.get(key);
            System.out.println(key + "=" + value1);
        }

        System.out.println("--------------------------");
        for(Integer integer : set){
            System.out.println(integer + "=" + map.get(integer));
        }


        //通过entrySet()方法遍历集合
        Set<Map.Entry<Integer,String>> set1 =  map.entrySet();
        Iterator<Map.Entry<Integer,String>> iterator1 = set1.iterator();
        while(iterator1.hasNext()){
            Map.Entry<Integer,String> node = iterator1.next();
            Integer key = node.getKey();
            String value1 = node.getValue();
            System.out.println(key + "=" + value1);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        for(Map.Entry<Integer,String> node : set1){
            System.out.println(node.getKey() + "=" + node.getValue());
        }
    }
}
