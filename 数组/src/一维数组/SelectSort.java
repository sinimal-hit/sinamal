package 一维数组;

import java.util.Arrays;

/*
    选择排序
    45,7,94,41,6进行排序
        第一次排序:挑出最小值和第一个元素交换:6,7,94,41,45
        第二次排序:最小值7,和第二个元素交换位置:6,7,94,41,45
        第三次排序:最小值41,和第三个元素交换位置:6,7,41,94,45,
        第四次排序:最小值45,和第四个元素交换位置:6,7,41,45,94

             排序完成

 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {45,7,94,41,6};

        selectSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = 0+i; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }


}
