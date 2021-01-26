package final关键字;
/*
    final修饰实例变量的时候,必须对实例变量赋值
    实例变量赋值是在构造方法的时候赋值
    final修饰的实例变量无法被改变,就说明,这个实例变量是所有对象共有的属性,那这样不就大大占用内存吗
    所以final修饰的实例变量,一般添加static修饰


*/
public class FinalTest02 {
    public static final double PI = 3.1412;
    public static void main(String[] args) {

    }
}
class User{
    //实例变量
    final int age = 10;
    String name;

    public User() {
        this.name = "武忠";
    }
}
