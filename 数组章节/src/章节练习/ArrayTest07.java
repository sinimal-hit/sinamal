package 章节练习;

import java.util.Arrays;

/*
    让数组元素奇数在前，偶数在后；
 */
public class ArrayTest07 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,14,16,1,8};
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void transform(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            while(arr[left] % 2 != 0 && left < right){
                left++;
            }
            while(arr[right] % 2 == 0 && left < right){
                right--;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
    }
}
