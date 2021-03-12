package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*
 关于java.util.Collection接口中的方法
    1,Collection中存放什么元素
        没有使用泛型之前,Collection中可以存储Object中的所有子类型
        使用泛型之后,Collection中只能存储某个具体的类型
    2,Collection中的常用方法
        boolean     add(Object e)  向集合中添加元素
        int         size()         获取集合中元素的个数
        void        clear()        清空集合
        boolean     contains(Object o)      判断当前中是否包含元素o
        boolean     remove(Object o)        删除当前集合中的某个元素
        boolean     isEmpty(Object 0)       清空集合中的元素
        Object[]    toArray()               集合转为数组
 */
public class CollectionTest01 {
    public static void main(String[] args) {
        //创建一个集合对象
        //Collection c = new Collection() ;接口时抽象的,无法实例化
        Collection c = new ArrayList();//多态

        //测试Collection接口中的常用方法
        c.add(1200);//自动装箱,实际上是放进去了一个对象的内存地址
        c.add(3.14);
        c.add(new Object());

        //获取集合中元素的个数
        System.out.println("集合中元素的个数:"+ c.size());//3

        //清空集合
        c.clear();
        System.out.println("集合中元素的个数:"+ c.size());//0

        //再向集合中增加元素
        c.add("Hello");
        c.add("world");
        c.add("men");
        c.add(1);

        //判断集合中是否包含men
        boolean flag  = c.contains("men");
        System.out.println(flag);//true
        System.out.println(c.contains("man"));//false

        //删除集合中的某个元素
        c.remove(1);
        System.out.println(c.size());//删除后还有3个元素

        //集合转换维数组
        Object[] objects = c.toArray();
        System.out.println(Arrays.toString(objects));//[Hello, world, men]
    }
}
