package TreeSet;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.TreeSet;
//放在TreeSet集合里面的自定类型元素,需要实现Comparable接口,并且实现接口中的compareTo()方法
public class TreeTest04 {
    public static void main(String[] args) {
        Customer c1 = new Customer(32);
        System.out.println("c1的age:"+c1);
        Customer c2 = new Customer(20);
        Customer c3 = new Customer(30);
        Customer c4 = new Customer(25);
        Customer c5 = new Customer(32);
        Customer c6 = new Customer(11);

        TreeSet<Customer> Customer = new TreeSet<>();
        Customer.add(c1);
        Customer.add(c2);
        Customer.add(c3);
        Customer.add(c4);
        Customer.add(c5);
        Customer.add(c6);

        //遍历
        for(Customer p : Customer){
            System.out.println(p);
        }
    }
}
class Customer implements Comparable<Customer>{
    int age;
    public Customer(int age){
        this.age = age;
    }

    //在这个方法中编写比较的逻辑,按照什么进行比较.
    //k.compareTo(k.key)
    //拿着参数k和集合中的每一个k进行比较,返回值可能是>0 <0 =0;
    //比较规则最终还是按照程序员来定的,按照年龄升序或者年龄降序
    @Override
    public int compareTo(Customer c) {//c1.compareTo(c2) 那么this就是c1 ,c 是c2
        //所以c1 和c2 比较的时候就是this和c比较
        return this.age - c.age;
    }
    @Override
    public String toString(){
        return "Customer[age = "+age+"]";
    }
}
