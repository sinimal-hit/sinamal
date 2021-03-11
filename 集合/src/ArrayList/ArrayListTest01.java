package ArrayList;

import list.ListTest01;

import java.util.ArrayList;
import java.util.List;

/*
ArrayList集合
    1,默认初始化容量10(底层先创建了一个长度为0的数组,当添加第一个元素的时候,初始化容量为10)
    2,集合底层是一个Object[]数组
    3,构造方法可以采用
        new ArrayList();
        new ArrayList(20);
    4,ArrayList集合的扩容
        原容量的1.5倍.
        ArrayLIst底层是数组,因为数组扩容的效率比较低,建议使用ArrayList集合
        的时候预估记元素的个数,给定一个初始化容量

    5,数组优点:
        检索效率高(每个元素占用空间大小相同,内存地址是连续的,知道首元素的内存地址,然后知道下标,通过数学表达式计算出元素
        的内存地址,所以查找的效率最高)
    6,数组缺点
        随机增删元素效率比较低
        另外,数组无法存储大数据量(很难找到一块巨大的连续的内存空间)
    7,面试管经常问的一个问题?
        这么多的集合中,你使用集合最多?
            答:ArrayList集合
            因为往数组末尾添加元素,效率不受影响
            另外,我们检索/查找某个元素的操作比较高
    8,ArrayList是非线程安全的集合
 */
public class ArrayListTest01 {
    public static void main(String[] args) {
        //默认初始化容量是10
        List list1 = new ArrayList();
        //集合的size()方式是获取当前集合的个数,不是获取集合的容量
        System.out.println(list1.size());//0
        //指定初始化容量
        //ArrayList arrayList = new ArrayList(-1);
        List list2 = new ArrayList(20);
        System.out.println(list2.size());//0
        //添加元素
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(10);

        //再次添加元素,集合需要扩容
        list1.add(11);
        list1.add("hel");

        //遍历数组
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }
}
