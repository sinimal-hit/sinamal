package static模块;
/*
    主要观察静态变量访问是否会出现空指针异常
    静态变量的访问是通过【类名.静态变量名】的方式访问，当让也可以使用【引用.静态变量名的方式访问】
        只不过编译器还是以类名的方式访问的。
    静态变量是存储在方法去内存当中的，当类加载，静态变量就已经完成赋值了
 */
public class StaticTest01 {
    public static void main(String[] args) {
        Chinese chinesePeople = new Chinese();
        chinesePeople = null;
        /*
        这里不出现空指针异常，是因为静态变量的访问不需要对象的存在，
        空指针异常只会出现在“空引用”来访问“对象【实例】”相关的，都会出现空指针异常
         */

        System.out.println(chinesePeople.country);
    }
}
class Chinese{
    String name;
    static String country;
}
