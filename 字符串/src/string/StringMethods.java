package string;
/**
 * 为什么String不可变?
 *      因为String中有一个byte[]来存放字符串,这个byte[]是被final修饰的,数组创建之后长度不可变,
 *          并且被final修饰的引用一旦指向一个对象后,就不能在指向其他对象了
 * 为什么StringBuffer/StringBuild为什么可变的
 *      StringBuffer/StringBuild内部实际是一个byte[]数组,这个数组没有被final修饰,StringBuffer/StringBuild
 *          的初始化容量我记得好像是16,存满之后,会进行扩容,底层调用数组拷贝的方法,System.arraycopy()...
 *          所以适合字符串频繁的拼接操作
 */

import java.util.Arrays;

/**
 * String 类中的常用方法
 *  1,(掌握)char   charAt(int index)  参数传的是数组下标,返回一个char值
 *
 *  2,int compareTo(String anotherString)  按字典顺序来比较字符串  (0 代表相等 ,-1代表后面大,1代表前面大)
 *      并且比较的时候值比较第一个元素,如果第一个元素相等,再往后比较第二个元素
 *
 *  3,(掌握)boolean contains(CharSequence s) 参数是两个字符串,判断前面的字符串是否包含后面的字符串
 *
 *  4,(掌握)boolean endsWith(String suffix) 判断当前字符串是否以某个字符串结尾
 *
 *  5,(掌握)boolean equals(Object anObject)  判断字符串师是否相等
 *
 *  6,(掌握)boolean equalsIgnoreCase(String anotherString)  ,判断两个字符串是否相等,忽略大小写
 *
 *  7,(掌握)byte[] getBytes()   将字符串对象转换成字节数组
 *
 *  8,(掌握)int indexOf(String str)  判断莫格字符串在当前字符串中出现处的索引
 *
 *  9,(掌握)boolean isEmpty()   判断当前字符串是否为空
 *
 *  10,(掌握)int length()   判断字符串的长度,这里需要注意 这里是方法,而数组里的length是属性
 *
 *  11,(掌握)int lastIndexOf(String str) 返回指定子字符串在当前字符串最后一次出现的字符串中的索引
 *
 *  12,(掌握)String replace(CharSequence target, CharSequence replacement)
 *      CharSequence是String类的父接口
 *
 *  13,(掌握) String[] split(String regex)  拆分字符串
 *
 *  14,(掌握) boolean startsWith(String prefix)  判断某个字符串是否以某个子字符换开始
 *
 *  15,(掌握)String substring(int beginIndex)    截取字符混穿,参数是起始下标
 *
 *  16,(掌握)String substring(int beginIndex, int endIndex)
 *      beginIndex,起始位置(包括)
 *      endIndex,结束位置(不包括)
 *
 *  17,(掌握)char[] toCharArray() 将字符串转换为char数组
 *
 *  18,(掌握)String toLowerCase()  将所有字符串转换为小写
 *
 *  19,(掌握)String toUpperCase() 将所有字符串转换为大写
 *
 *  20,(掌握)String trim()  去除字符串的前后空白
 *
 *  21,(掌握) static String   valueOf(参数)  是String中唯一一个静态方法,将非字符串转化为字符串
 *
 *  22,String intern() 返回字符串对象的规范表示。
 *      String.intern()是一个Native方法,它的作用是:如果字符常量池中已经包含一个等于此String对象的字符串
 *      ,则返回常量池中字符串的引用,否则,将新的字符串放入常量池,并返回新字符串的引用’
 */
public class StringMethods {
    public static void main(String[] args) {
        //1,charAt(int index)
        char c = "中国人".charAt(1);
        System.out.println(c); // 国,

        //2,compareTo(String anotherString)
        int result = "abc".compareTo("abc");
        System.out.println(result);// 0

        int result1 = "abcd".compareTo("abce");
        System.out.println(result1);//-1

        int result2 = "abce".compareTo("abcd");
        System.out.println(result2);//1

        //3,boolean contains(CharSequence s)
        System.out.println("HelloWord.java".contains(".java"));//true

        //4,boolean endsWith(String suffix)
        System.out.println("HelloWord.java".endsWith(".java"));//true
        System.out.println("HelloWord.java".endsWith(".txt"));//false

        //5,boolean equals(Object anObject)
        System.out.println("ab".equals("ab"));//true
        System.out.println("ab".equals("cb"));//false

        //6,boolean equalsIgnoreCase(String anotherString)
        System.out.println("AB".equalsIgnoreCase("ab"));//true

        //7,byte[] getBytes()
        byte[] bytes = "abcdef".getBytes();
        System.out.println(Arrays.toString(bytes));//[97, 98, 99, 100, 101, 102]

        //8,int indexOf(String str)
        System.out.println("python,java,c++".indexOf("c++"));//12

        //9,boolean isEmpty()
        System.out.println("".isEmpty());//true
        System.out.println(" ".isEmpty());//false

        //10,int length()
        System.out.println("abc".length());//3

        //11,int lastIndexOf(String str)
        System.out.println("python,java,c++,python,java,c++".lastIndexOf("c++"));//28

        //12,String replace(CharSequence target, CharSequence replacement)

        String s = "http://www.baidu.com".replace("http://","https://");
        System.out.println(s);// https://www.baidu.com
        String ss = "www.baidu.com".replace("baidu","google");
        System.out.println(ss);
        //13,String[] split(String regex) 是以某个字符串来分割
        String[] s1 = "1989-19-12".split("-");
        System.out.println(Arrays.toString(s1));//[1989, 19, 12]

        //14,boolean startsWith(String prefix)
        System.out.println("HelloWord.java".contains(".java"));//false

        //15,String substring(int beginIndex)  截取字符串
        System.out.println("http://www.baidu.com".substring(7));//www.baidu.com

        //16,String substring(int beginIndex, int endIndex)
        System.out.println("http://www.baidu.com".substring(7,10));//www

        //17,char[] toCharArray()
        char[] chars = "中国人".toCharArray();
        System.out.println(Arrays.toString(chars));//[中, 国, 人]

        //18,String toLowerCase()
        System.out.println("ABAJS".toLowerCase());//abajs

        //19,String toUpperCase()
        System.out.println("abcdl".toUpperCase());//ABCDL

        //20,String trim()
        System.out.println("       shi     sji       ".trim());//shi     sji

        //21,static String valueOf(参数)
        String  s3 =  String.valueOf(true);
        System.out.println(s3);//"true"

        //22,String intern()
        new String("Hello").intern();


        /**
         * 当valueOf()方法的参数是一个引用的时候,会将调用该对象的toString()方法
         *  public static String valueOf(Object obj) {
         *         return (obj == null) ? "null" : obj.toString();
         *     }
         */
        System.out.println(String.valueOf(new Object()) );//java.lang.Object@14ae5a5


    }
}
