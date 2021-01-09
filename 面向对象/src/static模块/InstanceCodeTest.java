package static模块;
/*
    除了静态代码块还有一种语句块之外还有一种实例语句块
    实力语句块并没有在类加载的时候执行。
    可以发现实例语句块是在构造方法执行之前执行，冰倩每调用一次构造方法，实例语句块就是执行一次
    这也是SUN公司给java程序员提供的一个特殊时机，叫做对象构建时机
 */
public class InstanceCodeTest {
    //构造方法
    public InstanceCodeTest(){
        System.out.println("无参数构造方法");
    }
    //构造方法
    public InstanceCodeTest(String name){
        System.out.println("有参数的构造方法");
    }

    //实例语句块
    {
        System.out.println("实力语句块执行");
    }
    public static void main(String[] args) {
        System.out.println("main--->begin");
        new InstanceCodeTest();

    }
}
