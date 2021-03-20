package LinkedList;

import java.util.LinkedList;
import java.util.List;
/*
链表的优点:
    由于链表上的元素在空间上的存储的内存地址是不连续的,所以速记增删元素的时候不会又大量的位移,
    因此随机增删效率较高,在以后的开发中,如果遇到随机增删集合中元素的业务比较多的时候,建以使用LinkedList

链表的缺点:
    不能通过数学表达式计算查找元素的内存地址,每一次查找都是从头节点开始遍历,直到找到为止,所以LinkedList
    集合检索/查找的效率较低
    ArrayList:把检索发挥到极致;
    LinkedList:把随机增删发挥到极致;
 */
public class LinkedListTest01 {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
     }
}
