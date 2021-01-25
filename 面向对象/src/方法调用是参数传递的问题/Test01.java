package 方法调用是参数传递的问题;

public class Test01 {
    public static void main(String[] args) {
        Person p = new Person();
        p.age = 10;
        add(p);
        System.out.println("main()---->" + p.age);
    }
    public static void add(Person person){
        person.age++;
        System.out.println("add()---->"+person.age);
    }
}
class Person{
    int age;
}

