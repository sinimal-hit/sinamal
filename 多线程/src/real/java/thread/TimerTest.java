package real.java.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
使用定时器指定定时任务
 */
public class TimerTest {
    public static void main(String[] args) throws ParseException {
        //创建定时器对象
        Timer timer = new Timer();
        //Timer timer = new Timer(true);  守护线程的方式

        //指定定时任务
        //timer.schedule(定时任务,第一次执行时间.间隔多久执行一次);

        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");

        Date firstTime = sdf.parse("2021-02-20 10:01:00");
        timer.schedule(new LogTimerTask(),firstTime,1000*10);
    }
}
//编写一个定时任务类
//假设这是一个记录日志的定时任务
class LogTimerTask extends TimerTask {

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strTime = sdf.format(new Date());
        System.out.println(strTime + ":成功完成了一次数据备份!");
    }
}