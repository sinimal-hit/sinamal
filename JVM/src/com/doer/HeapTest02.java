package com.doer;

/*
内存的大小
堆内存的调节
设置JVM参数-Xms:设置初始化内存分配大小、-Xmx:设置最大分配内存

-XX:+PrintGCDetails:
打印GC垃圾回收信息

-XX:+HeapDumpOnOutOfMemoryError
oom dump

-Xms1024m -Xmx1024m -XX:+PrintGCDetails /打印GC的详细信息
-Xmx20m -Xms20m -XX:+HeapDumpOnOutOfMemoryError

OOM:内存溢出
    1.尝试扩大堆内存看结果
    2.分析内存,看一下那个地方出现了问题(专业问题)

 */
public class HeapTest02 {
    public static void main(String[] args) {
        //返回虚拟机试图使用的最大内存
        long maxMemory = Runtime.getRuntime().maxMemory(); //字节为单位  1024*1024 = M
        //返回jvm的初始化总内存
        long totalMemory = Runtime.getRuntime().totalMemory();

        System.out.println("maxMemory=" + maxMemory + "字节\t" + (maxMemory/(double)1024/1024)+"MB");
        System.out.println("totalMemory=" + totalMemory + "字节\t" + (totalMemory/(double)1024/1024)+"MB");

        //默认情况下,分配的总内存时电脑内存的四分之一,而初始化内存:1/64
    }

}
