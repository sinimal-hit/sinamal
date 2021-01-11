package 面向对象;

public class T {
    A ai;

    public static void main(String[] args) {
        D d = new D();
        C c = new C();
        B b = new B();
        A a = new A();
        T t = new T();

        //以下代码不写会发生空指针异常，
        //光把对象new出来了，但是没赋值啊相当于 A ai == null
        a.bi = b;
        b.ci = c;
        c.di = d;
        t.ai = a;
        //编写代码通过t来访问d中的i
        //System.out.println(t.a.b.c.d.i);
        System.out.println(t.ai.bi.ci.di.i);
        System.out.println(d.i);
    }
}
class A{
    B bi;
}
class B{
    C ci;
}
class C{
    D di;
}
class D{
    int i;
}
