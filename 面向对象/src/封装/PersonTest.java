package 封装;
/*
    不使用封装会有什么结果
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.age);
        //对age进行修改
        p.age = -100;
        System.out.println("您的年龄是："+p.age); //-100
        /*
        在PersonTest这个类中可以随意访问age属性进行操作，
        但是一个人的年龄是不可能为负数的，按理来说不符合业务要求的，这就是一个bug
        而随意对Person内部的数据进行访问，导致了不安全。
         */
    }
}
//没有封装的Person
class Person{
    int age;
}



