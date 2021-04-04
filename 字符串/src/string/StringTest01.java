package string;
/*
java中内置的类 java.lang.String
    1、String表示字符串数据类型，属于引用数据类型，不属于基本类型
    2、在java中用双引号括起来的都是String对象；例如“hellow”，“abc”
    3、java中括起来的双引号是不可变的。也就说“abc”自出生到死亡，不可变，不能变为“abcd”
    4、用双引号括起来的字符串，都存放在“方法区”的“字符串常量池”当中。
        为什么要把字符串存储在字符串常量池当中呢，因为字符串在实际开发中的使用太过于频繁。为了执行效率，
        所以把它放到了字符串常量池中
 */
public class StringTest01 {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "abcd" + "xy";
        //new 对象的时候一定在堆内存开辟空间。
        String s3 = new String("xy");
    }
}
