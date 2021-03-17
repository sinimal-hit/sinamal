package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    重点:放在HashMap集合key部分的元素,以及放在HashSet集合中的元素,需要同时重写hashCode()方法和equals()方法

    HashMap集合的默认初始化容量是16,默认加载因子是0.75
        这个默认加载因子是当HashMap集合底层数组的容量达到75%的时候,数组开始扩容
        重点,记住:HashMap集合初始化容量必须是2的倍数,这也是官方推荐的,
        这是因为达到散列均匀,为了提高HashMap集合的存取效率,所必须的.

 */
public class HashMapTest01 {
    public static void main(String[] args) {
        //测试HashMap集合key部分元素的特点
        Map<Integer,String> map = new HashMap<>();
        map.put(11,"zhangsan");
        map.put(22,"lisi");
        map.put(33,"wangwu");
        map.put(77,"zhaoliu");
        map.put(22,"king");//key重复的时候,value就覆盖了

        System.out.println(map.size()); //4

        //遍历Map集合
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        for(Map.Entry<Integer,String> node:set){
            //验证结果:HashMap集合key部分元素:无序不可重复.
            System.out.println(node.getKey() + "=" + node.getValue());
        }
    }
}
