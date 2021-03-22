package TreeSet;

import java.util.TreeSet;

/*
对自定义类型,TreeSet可以进行排序?
    以下程序来说对于Person来说,无法排序,因为没有指定Person对象之间的比较规则
    谁大谁小没有说明

    以下程序运行的时候出现了这个异常
        Exception in thread "main" java.lang.ClassCastException: TreeSet.Person cannot be cast to java.lang.Comparable

    出现这个异常的原因:
        Person类没有实现java.lang.Comparable接口
 */
public class TreeSetTest03 {
    public static void main(String[] args) {
        Person p1 = new Person(32);
        System.out.println(p1);
        Person p2 = new Person(20);
        Person p3 = new Person(30);
        Person p4 = new Person(25);
        Person p5 = new Person(32);
        Person p6 = new Person(11);

        TreeSet<Person> people = new TreeSet<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        people.add(p6);

        //遍历
        for(Person p : people){
            System.out.println(p);
        }
    }
}
class Person{
    int age;
    public Person(int age){
        this.age = age;
    }
    //重写toString方法
    public String toString(){
        return "Person[age+"+age+"]";
    }
}
