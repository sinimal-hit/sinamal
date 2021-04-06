package stringbuffer;
/*
我们在开发中会对字符串进行频繁的拼接，
因为java中的字符串是不可变的，每一次拼接会产生新字符串
这样会占用大量的方法区内存会给字符串常量池带来很大的压力。

如果以后需要大量字符串拼接操作，建以使用jdk中自带:
    java.lang.StringBuffer
    java.lang.StringBuider
 */
public class StringBufferTest01 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
    }
}
