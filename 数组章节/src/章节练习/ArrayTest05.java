package 章节练习;

import java.lang.reflect.Array;
import java.util.Arrays;

import static java.util.Arrays.binarySearch;

/*
    二分查找
    1、必须保证查找的数组是有序的，（升序，降序）
        本质在于，拿带查找区间的中间元素，和带查找元素进行比较，
        每次比较都能砍掉有一半的区间。
 */
public class ArrayTest05 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,9,12,16,22};
        int[] arr1 = {45,85,411,2,4,1213,9};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("==============");
        int pos = binarySearch(arr,5);
        System.out.println(pos);
    }
    public static int binarySearch(int[] arr, int toSearch){
        int left = 0;
        int right = arr.length -1;
        while(left <= right){
            int mid = (left + right)/2;
            if(toSearch < arr[mid]){
                //在左侧区间查找
                right = mid - 1; //数组下标

            }else if(toSearch > arr[mid]){
                //右侧区间查找
                left = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
