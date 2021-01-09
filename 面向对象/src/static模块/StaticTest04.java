package static模块;
/*
    方法区内存存的就是静态变量和代码片段
    栈：方法执行，就会在栈内开辟空间压栈（局部变量）
    堆：new出来的对象都会存储在堆中，GC也主要针对堆内存中的数据
    方法区：类的信息，字节码信息，代码片段（静态变量）
        方法的大妈片段放在方法区内存中，但是方法执行过程需要在栈内存中执行。
 */
public class StaticTest04 {
    static int i = 100;//静态变量
    int n = 19;
    static {
        System.out.println("i = " + i);
        //System.out.println("n = " + n);静态代码块是无法获取非静态变量，因为n变量的空间还没有开辟出来


    }
    public static void main(String[] args) {
        System.out.println("main ---> begin");
    }
}
