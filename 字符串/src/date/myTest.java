package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class myTest {
    public static void main(String[] args) throws ParseException {
        //怎么获取系统当前时间
        Date nowTime = new Date();
        System.out.println(nowTime);

        //Date类型的时间转换成String类型的时间

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String nowTimeString = sdf.format(nowTime);
        System.out.println(nowTimeString);

        //String类型的时间转换成Date类型的时间

        String nowTime1 = "2000-02-02 14:14:14 444";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date date =  sdf2.parse(nowTime1);
        System.out.println(date);
    }
}
