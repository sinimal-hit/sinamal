package 交换两个数组;

import java.util.Arrays;

/*
给定两个整型数组, 交换两个数组的内容.
 */
public class Test {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
        try {
            swapArrays(arr1, arr2);
            System.out.println(Arrays.toString(arr1));
            System.out.println(Arrays.toString(arr2));
        } catch (ArraysLengthException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void swapArrays(int[] arr1, int[] arr2) throws ArraysLengthException {
        if(arr1 == null || arr2 == null){
            return;
        }
        if(arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                int temp = arr1[i];
                arr1[i] = arr2[i];
                arr2[i] = temp;
            }
        }else {
            throw new ArraysLengthException("数组交换长度异常,数组长度须保持一致");
        }
    }
}
class ArraysLengthException extends Exception{
    public ArraysLengthException() {
    }

    public ArraysLengthException(String message) {
        super(message);
    }
}
