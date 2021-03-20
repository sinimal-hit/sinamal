package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
测试List接口中的常用方法'
    1,List集合存储元素的特点:有序可重复
        有序:List集合中的元素有下表
        从0开始,以1递增
        可重复:存储一个1,还可以再存储1
    2,List既然是Collection接口的子接口,那么List肯定有自己特色的方法
        void add(int index, Object element)
        Object get(int index)
        int indexOf(Object o)
        int lastIndexOf(Object o)
        Object remove(int index)

        Object set(int index, Object element)
 */
public class ListTest01 {
    public static void main(String[] args) {
        List myList = new ArrayList();
        myList.add("A");//默认都是向集合末尾添加元素
        myList.add("B");
        myList.add("C");
        myList.add("C");
        myList.add("D");
        //向列表的指定位置添加元素
        //这种方法使用不多,因为ArrayList集合来说效率较低,他的底层也是数组
        myList.add(1,"KING");
        //迭代
        Iterator it = myList.iterator();
        while(it.hasNext()){
            Object elt = it.next();
            System.out.println(elt);
        }
        //根据下标获取元素
        Object firstObj = myList.get(0);
        System.out.println(firstObj);//A

        //有下标之后,所以List集合有自己比较特殊的遍历方式
        //通过下标遍历[List集合特有的遍历方式,set集合没有]
        for (int i = 0; i < myList.size(); i++) {
            Object obj = myList.get(i);
            System.out.println(obj);
        }

        //获取指定对象第一次出现处的索引
        System.out.println(myList.indexOf("king"));//-1 没找到,返回-1
        System.out.println(myList.indexOf("KING"));//1

        System.out.println(myList.indexOf("C"));//C第一次出现的索引位置  3
        System.out.println(myList.lastIndexOf("C"));//C最后一次出现的位置 :4

        //删除指定下标位置的元素
        myList.remove(0);
        System.out.println(myList.size());//删除完之后还有5个元素

        //修改指定位置的元素
        myList.set(2,"Soft");
        //遍历集合
        System.out.println("-----------------------------");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
    /*
    计算机英语:
        增删改查
            增:add,save,new
            删:delete drop,remove
            改:update,set,modify
            查:find,get,query,select
     */
}
