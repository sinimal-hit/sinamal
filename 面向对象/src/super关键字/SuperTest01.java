package super关键字;

public class SuperTest01 {
    public static void main(String[] args) {
        //创建子类型对象
        /*
            A类的无参构造方法
            B类的无参构造方法
         */
        new B();
    }

}
class A{
    public A() {
        System.out.println("A类的无参构造方法");
    }
}
class B extends A{
    public B() {
        System.out.println("B类的无参构造方法");
    }
}
