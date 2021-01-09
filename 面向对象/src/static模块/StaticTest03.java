package static模块;
/*
    静态代码块是在类加载时执行，在main方法执行之前执行，
    静态代码块一般是按照自上而下的顺序执行的
 */
public class StaticTest03 {
    static {
        System.out.println("A");
    }
    static {
        System.out.println("B");
    }
    //程序入口
    public static void main(String[] args) {
        System.out.println("hello word");
    }
    static {
        System.out.println("C");
    }
}
