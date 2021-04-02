package string;

import org.omg.CORBA.INTERNAL;

public class NumberFormatException {
    public static void main(String[] args) {
        //手动装箱
        Integer x = new Integer(100);
        //出搜东拆箱
        int y = x.intValue();


        Integer x1 = new Integer("123");

        //java.lang.NumberFormatException,数字格式化异常
        //Integer x2 = new Integer("中国");

        /**
         * 重点方法,静态方法, static int    parseInt(String s)  传参String  返回int
         * 网页上文本框输入100的时候,实际上输入的是字符串"100",后台数据库要求存储数据100,此时
         * java程序需要将"100"字符串转化为数字100
         */

        int retValue =  Integer.parseInt("123"); //String --->转换成  int
//        Integer.parseInt("中国");  同样会出现数字转换异常
//        Integer.parseInt("abc");
        System.out.println(retValue + 100);  //223


    }
}
