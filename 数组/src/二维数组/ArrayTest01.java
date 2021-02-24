package 二维数组;

import java.util.Arrays;

public class ArrayTest01 {
    public static void main(String[] args) {
        //一个二维数组,里面有四个一维数组
        int[][] a = {
                {1,2,3,4,5},
                {2,3,4,5,6,8},
                {21,2,3,45},
                {0,1}
        };
        System.out.println(a.length);//4  表示二维数组的长度
        System.out.println(a[0].length);//5 表示二维数组中第一个元素的长度
        System.out.println(a[1].length);//6 表示二维数组中第一个元素的长度

        int[] a1 = a[0];//表示将二维数组中的第一个元素:一维数组,赋值给a1
        System.out.println(Arrays.toString(a1));
        System.out.println(a[0][0]);
    }
}
