package 面向对象;
/*
    空指针异常
    关于GC
        在java语言中，GC主要针对堆内存中的垃圾数据，当一个对象没有任何的引用指向该对象的时候，
        GC会考虑将该垃圾数据回收掉
    出现空指针异常的前提
        “空引用” 来访问实例相关的【对象相关的】数据，都会出现空指针异常
 */
public class NullPointTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println(customer.id);

        //重新给id赋值
        customer.id = 9521;
        System.out.println(customer.id);

        //赋值给null
        customer = null;
        /*
        NullPointerException,
        这时候编译器并不会报错，编译器只检查语法，因为customer是Customer类型的变量，
        并且Customer中有id属性，语法就通过了
        但是运行期间，访问id是需要对象的存在的，这时候对象没了，就出现了空指针异常
         */
        System.out.println(customer.id);

        String name = "nihao";
        System.out.println(name);//nihao
        name = null;
        System.out.println(name);//null
        // ????why  字符串那倒不是对象吗，给了空还不出现空指针异常？？？


    }
}
class Customer{
    //客户id
    int id;//成员变量中的实例变量，先创建对象，在通过引用来访问

}
