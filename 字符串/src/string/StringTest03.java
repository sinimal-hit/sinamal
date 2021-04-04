package string;

/**
 * 面试题:
 *  问这个程序一共创建了几个对象
 *
 *      一共三个对象,方法区内存当中一个对象 hello
 *                 堆内存当中一个两个对象 分别new了两次
 */
public class StringTest03 {
    public static void main(String[] args) {

        String s1 = new String("hello");
        String s2 = new String("hello");
    }
}
