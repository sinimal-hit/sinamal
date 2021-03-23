package TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

/*
TreeSet集合元素中可排序的第二种方式:使用比较器比较
    放到TreeSet或者TreeMap集合key部分的元素想要做到排序,包括两种方式:
        第一种:放在集合中的元素实现java.lang.Comparable接口.
        第二种:在构造TreeSet或者TreeMap的时候给他传一个集合器对象.
Comparable 和 Comparator怎么选择呢?
    当比较规则只有一个时候,或者说当比较规则只有一个的时候,建议实现Comparable接口
    如果比较规则有多个,并且需要多个比较规则之间频繁切换的时候,建议使用Comparator接口..Comparator符合OCP原则
 */
public class TreeSetTest06 {
    public static void main(String[] args) {
        //创建TreeSet集合的时候,使用比较器的方式
        //TreeSet<WuGui> wuGuis = new TreeSet<>(); 这样不行,没有通过构造方法传递一个比较器进去
        TreeSet<WuGui> wuGuis = new TreeSet<>(new Comparator<WuGui>(){
            @Override
            public int compare(WuGui o1, WuGui o2) {
                return o1.age - o2.age;
            }

        });
        wuGuis.add(new WuGui(1000));
        wuGuis.add(new WuGui(100));
        wuGuis.add(new WuGui(2999));
        for(WuGui wuGui : wuGuis){
            System.out.println(wuGui);
        }

        //直接使用匿名内部类的方式
    }
}
//乌龟
class WuGui{
    public int age;

    public WuGui(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "小乌龟[" +
                "age=" + age +
                ']';
    }
}

//单独再这里编写一个比较器,比较器实现java.util.Comparator接口,(Comparable是java.lang包下的.Comparator是java.util包下的
//class WuGuiComparator implements Comparator<WuGui>{
//
//    @Override
//    public int compare(WuGui o1, WuGui o2) {
//        //指定比较规则
//        //按照年龄比较
//        return  o1.age - o2.age;
//
//    }
//}
