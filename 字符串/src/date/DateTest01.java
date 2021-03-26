package date;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 该类主要掌握
 *      知识点1:怎么获取系统当前时间
 *      知识点2:String ---> Date(需要注意构造方法的参数需要和字符串类型日期格式保持一致)不然会出现异常
 *          使用SimpleDateFormat类中的  format()方法  .
 *      知识点3:Date ---> String
 *          使用SimpleDateFormat类中的  parse()方法
 * java中对日期的处理(在API文档的java.util下的  Date类)
 *      构造方法 :
 *             Date()分配一个 Date对象，并初始化它，以便它代表它被分配的时间，测量到最近的毫秒
 *             Date(long date) 分配一个 Date对象，并将其初始化为表示自称为“时代”的标准基准时间以后的指定毫秒数，
 *                     即1970年1月1日00:00:00 GMT
 *
 * 格式化日期的类:SimpleDateFormat,是java.text包下的,专门负责日期格式化的
 *      构造方法 里的参数格式详细看JDK文档
 */
public class DateTest01 {
    public static void main(String[] args) throws ParseException {
        //获取系统当前时间(精确到毫秒的系统当前时间)
        Date nowTime = new Date();
        //java.util.Date这个类的toString方法已经被重写
        System.out.println(nowTime);//Fri Jan 08 19:28:04 GMT+08:00 202

        //格式化日期,将日期类型Date,按照指定的格式进行转换,:转换成具有一定格式的
        // 日期字符串--->String
        //SimpleDateFormat是java.text包下的,专门负责日期格式化的

        /**
         *  yyyy年  MM月  dd日  HH时  mm分  ss秒  SSS 毫秒    四个y代表4位,年时4位的  后面以此类推
         *  注意在日期格式中除了 y M d H m s S 这些字符随便写之外,剩下的符号格式自己随意组织
          */
        SimpleDateFormat sdf  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String nowTimeStr = sdf.format(nowTime);
        System.out.println(nowTimeStr);  //2021-01-08 19:44:10 142

        System.out.println(sdf.format(new Date()));//2021-01-08 19:45:08 222


        //假设现在有一个日期字符串String,怎么转换成Date类型?
        // String --->  Date  调用SimpleDateFormat类中的parse方法可以将String类型的日期字符串转为Date类型
        String time = "2010-01-01 08:08:08 888";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date dateTime = sdf2.parse(time);
        System.out.println(dateTime);//Fri Jan 01 08:08:08 GMT+08:00 2010
    }
}
