package 奇数放到数组后面;

import java.util.Arrays;

/*
给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面.
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {21,32,22,11,1};
        order1Arr(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void order1Arr(int[] arr) {
        if (arr == null) {
            return;
        }
        int length = arr.length;
        int begin = 0;
        int end = length - 1;
        while (begin < end) {
            if (arr[begin] % 2 != 0 && arr[end] % 2 == 0) {//前是奇数，后是偶数
                int temp = arr[begin];
                arr[begin] = arr[end];
                arr[end] = temp;
                begin++;
                end--;
            } else if (arr[begin] % 2 != 0 && arr[end] % 2 != 0) {//前是奇数，后是奇数
                //不交换，前不变，后减一
                end--;
            } else if (arr[begin] % 2 == 0 && arr[end] % 2 == 0) {//前是偶数，后是偶数，前+1
                begin++;
            }
        }
    }
}
