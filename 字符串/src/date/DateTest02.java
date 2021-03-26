package date;
/*
    获取自1970年1月1日 00:00:00 到当前系统时间的总毫秒数;    1秒 = 1000毫秒
    System类下的currentTimeMillis方法
 */
public class DateTest02 {
    public static void main(String[] args) {
        long nowTimeMills = System.currentTimeMillis();;
        System.out.println(nowTimeMills);//1610107252206
        long begin = System.currentTimeMillis();
        print();
        long end = System.currentTimeMillis();
        System.out.println("耗费时长:" + (end - begin) + "毫秒");
    }
    //需求:统计一个方法执行耗费的时长;]
    public static void print(){
        for (long i = 0; i < 1000000000; i++) {
            System.out.println("i = " + i);

        }
    }
}
