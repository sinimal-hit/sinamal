package util;

public class TimeMemoryUtil {
    private static long concurrentTimeStart;
    private static long concurrentMemoryStart;
    private static long concurrentTimeEnd;
    private static long concurrentMemoryEnd;

    public static void start() {
        //得到程序开始时的系统时间（纳秒级，最终转化毫秒，保留小数点后两位）
        concurrentTimeStart = System.nanoTime();
        //得到虚拟机运行、程序开始执行时jvm所占用的内存。
        Runtime runtime = Runtime.getRuntime();
        concurrentMemoryStart = runtime.totalMemory() - runtime.freeMemory();
    }

    public static void   end() {
        //得到程序执行完毕时的系统时间（毫秒级）
        concurrentTimeEnd = System.nanoTime();
        //得到虚拟机运行、所要测试的执行代码执行完毕时jvm所占用的内存（byte）。
        Runtime runtime = Runtime.getRuntime();
        concurrentMemoryEnd = runtime.totalMemory() - runtime.freeMemory();

        //计算start和end之间的代码执行期间所耗时间(ms)与内存(M)。
        // 1毫秒(ms) = 1000微秒(us) = 1000 000纳秒(ns)
        // 1M = 1*2^20 byte = 1024 * 1024 byte;
//        String time = String.valueOf((double) (concurrentTimeEnd - concurrentTimeStart) / 1000000);
//        String memory = String.valueOf((double) (concurrentMemoryEnd - concurrentMemoryStart) / 1024 / 1024);
        long timeConsume = (concurrentTimeEnd - concurrentTimeStart) / 1000000;
        long memoryConsume = (concurrentMemoryEnd - concurrentMemoryStart)/1024/1024;
        System.out.println("程序时间消耗:"+timeConsume + " ms");
        System.out.println("程序内存消耗:"+memoryConsume + "M");
    }

}
