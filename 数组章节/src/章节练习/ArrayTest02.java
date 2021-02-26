package 章节练习;

import java.util.Arrays;

/*
    数组拷贝
    1、int[] arr1 = arr2；
        此操作并不是将arr2数组里的值拷贝到arr1里面，而是针对数组创建了一个新的别名；
    标准库中java.util.Arrays中有Arrays.copyOf的方法来对数组进行复制；
    2、Arrays.copyOf() 里的参数，第一个数拷贝的目标，第二个是需要拷贝的长度，可以进行截断
        方式来进行复制，如果长度过多，会用0来进行补充
 */
public class ArrayTest02 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] result = copyOf(arr);
        System.out.println(Arrays.toString(result));
        int newArr[] = Arrays.copyOf(arr,arr.length+1);
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] copyOf(int[] arr) {
        //数组拷贝先创建一个新的数组对象；
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

}
