package HashMap;

import java.util.*;

/*


1:向Map集合中存,以及向Map集合中取,都是先调用key的hashCode()方法,然后再调用equals()方法
    equals()方法有可能调用,也有可能不调用,
        拿put(k,v)举例,当调用hashCode()算法后返回的值不一样的时候,是不会调用equals()方法的,
            k.hashCode()方法返回哈希值,
            哈希值经过哈希算法转换成数组下标
            数组下标位置上如果是null,equals不需要执行
        拿get(k,v)举例:什么时候equals()方法不会执行
            如果单项链表中只有一个元素时,不需要调用equals()方法.
            k.hashCode()方法返回哈希值
            哈希值经过哈希算法转化成数组下标.
            数组下标位置上如果是null,equals不需要执行

2.注意:如果一个类的的equals()方法重写了,那么hashCode()方法必须重写.
    并且equals方法的返回值是true,hashCode()方法的返回值必须一样

4.结论:
    放在HashMap集合key部分的,以及放在HashSet集合中的元素,需要同时重写hashCode()方法和equals()方法

5. 再JDK8之后,如果哈希表单链表中的元素超过8个,单项链表这种数据结构会变成二叉树或者红黑树这种数据结构
    当红黑树上的节点数量小于6时,又会变为单项链表.
        static final int TREEIFY_THRESHOLD = 8;
        static final int UNTREEIFY_THRESHOLD = 6;

    这种方式是为了提高检索效率,二叉树的检索效率再次缩小扫描范围,提高效率
 */
public class HashMapTest02 {
    public static void main(String[] args) {
        //Student类重写equals方法,没有重写hashCode()方法
        Student s1 = new Student("zhangsan");
        Student s2 = new Student("zhangsan");


        System.out.println("s1的hashCode = "+s1.hashCode());//21685669
        System.out.println("s2的hashCode = "+s2.hashCode());//2133927002

        Set<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        /**
         * 按理来说size()的结果应该是1,但结果是2,显然不符合HashSet集合的存储特点
         */
        System.out.println(set.size());//2


    }
}
class Student{
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
      if(o == null || !(o instanceof Student)) return false;
      if(o == this) return true;
      Student student = (Student)o;
      return this.name.equals(student.name);
    }


}
