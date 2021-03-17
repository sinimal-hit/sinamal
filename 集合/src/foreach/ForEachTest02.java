package foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachTest02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("word");
        list.add("ni");

        //遍历,使用迭代器方式
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //使用下标方式,(只针对于有下标的集合)
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //使用foreach
        for(String s : list){//因为泛型使用的是String类型,所以是String s
            System.out.println(s);
        }
    }
}
