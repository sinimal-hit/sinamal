package TreeSet;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.TreeSet;

/*
1,TreeSet集合底层实际是一个TreeSet
2,TreeMap集合底层是一个二叉树
3,放到TreeSet集合key部分的元素,等同于TreeMap集合key部分了
4,TreeSet集合中的元素,无序不可重复,但可以按照元素大小顺序自动排序.
    称为:可排序集合
 */
public class TreeSetTest02 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        //添加String
        ts.add("zhangsan");
        ts.add("lisi");
        ts.add("wangwu");
        ts.add("zhangsi");
        ts.add("wangliu");

        //遍历
        for(String s : ts){
            //字典顺序
            System.out.println(s);
        }

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(100);
        treeSet.add(211);
        treeSet.add(12);
        treeSet.add(1421);
        treeSet.add(11);

        for(Integer i : treeSet){
            //升序
            System.out.println(i);
        }
    }
}
