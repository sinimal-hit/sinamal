package 章节练习;
/*
    数组的逆序
 */
import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest06 {
    public static void main(String[] args) {
        int[] arr = {9,5,2,7};
        reserve(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reserve(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
