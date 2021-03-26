package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
    Date(long date) 有参构造
 */
public class DateTest03 {
    public static void main(String[] args) {
        Date time = new Date(1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss  SSS");
        String nowTime =  sdf.format(time);
        System.out.println(nowTime);//
        // 1970-01-01 08:00:00  001
    }
}
