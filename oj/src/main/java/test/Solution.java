package test;


import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] args){
        long concurrentTimeStart = System.nanoTime();
        Runtime runtime = Runtime.getRuntime();
        long concurrentMemoryStart = runtime.totalMemory() - runtime.freeMemory();
        List list = new LinkedList();
        int[] arr = new int[100000];
        int[] arr1 = new int[100000];
        int[] arr2 = new int[100000];
        for (int i = 0; i < 10000000; i++) {
            i++;
        }
        long concurrentTimeEnd = System.nanoTime();
        long concurrentMemoryEnd = runtime.totalMemory() - runtime.freeMemory();
        System.out.println(":"+((concurrentTimeEnd - concurrentTimeStart) / 1000000) + " ms");
        System.out.println(":"+((concurrentMemoryEnd - concurrentMemoryStart)/1024/1024) + "M");
    }
}
