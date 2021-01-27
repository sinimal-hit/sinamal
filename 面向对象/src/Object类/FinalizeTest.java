package Object类;
/*
    关于Object类中的finalize()方法
        1.源码
            protected void finalize() throws Throwable { }

        2.这个方法不需要程序员手动调用,JVM的垃圾回收器负责调用这个方法

        3.finalize()方法的执行时机
            当一个java对象即将被垃圾回收器回收的时候,垃圾回收器负责调用finalize()方法,
        4.finalize()方法实际上是SUN公司为java程序员准备的一个时机,垃圾销毁时机,如果希望在对象销毁时机
            执行一段代码的时候,这段代码要放在finalize()方法里面
        5.java中的垃圾回收器不是轻易启动的,垃圾太少,或者时间没到,种种条件下,有可能启动,也有可能不启动

        6.有一个方法可以建议垃圾回收器启动,只是建议,可能不启动
            System.gc()

 */
public class FinalizeTest {
    public static void main(String[] args) {
        Person p = new Person();
        //我这里执行,垃圾回收器并没有执行,那就多造点垃圾
        p = null;
        System.gc();
//        for (int i = 0; i < 1000000; i++) {
//            Person person = new Person();
//            person = null;
//        }


    }
}
class Person{
    //重写finalize()方法
    protected void finalize() throws Throwable {
        System.out.println(this+"即将被销毁");
    }
}