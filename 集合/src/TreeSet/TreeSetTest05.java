package TreeSet;

import java.util.TreeSet;

/*
先按照年龄升序,如果年龄一样的,按照姓名升序

 */
public class TreeSetTest05 {
    public static void main(String[] args) {
        TreeSet<Vip> vips = new TreeSet<>();
        vips.add(new Vip("zhangsan",20));
        vips.add(new Vip("zhangsi",20));
        vips.add(new Vip("zhangsi",11));

        for (Vip s : vips){
            System.out.println(s);
        }
    }
}
class Vip implements Comparable<Vip>{
    String name;
    int age;

    public Vip(String name, int age) {
        this.name = name;
        this.age = age;
    }



    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    /*
    compareTo方法很重要,
        返回0表示相同,value会覆盖
        返回>0 会继续在右子树上找
        返回<0 会继续在左子树上找`
     */
    @Override
    public int compareTo(Vip v) {
        if(this.age == v.age){
            //年龄相同时,按照名字排序,姓名是String类型,直接使用String类中的compareTo()方法
            return this.name.compareTo(v.name);
        }else {
            return this.age - v.age;
        }

    }
}
