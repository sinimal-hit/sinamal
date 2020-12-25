package File;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/*
    File类的常用方法

 */
public class FileTest02 {
    public static void main(String[] args) {
        File f1 = new File("D:\\IDEA\\文件及流\\src\\File\\FileTest01");
        //获取文件名
        System.out.println("文件名:"+f1.getName());

        //判断是否是个目录
        System.out.println(f1.isDirectory());

        //判断是否是个文件
        System.out.println(f1.isFile());

        //获取文件最后一修改时间
        long haomiao = f1.lastModified();//这个毫秒是从1970年到现在的秒数；
        //将毫秒转换为日期？
        Date time = new Date(haomiao) ;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime = sdf.format(time);
        System.out.println(strTime);

        //获取文件大小
        System.out.println(f1.length());
        //
    }
}
