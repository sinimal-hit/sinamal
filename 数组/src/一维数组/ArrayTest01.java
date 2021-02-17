package 一维数组;

public class ArrayTest01 {
    public static void main(String[] args) {
         //静态数组
        int[] arr1 = {1,1,2,34};
        printArray(arr1);
        System.out.println("\n"+"=======================");
        //动态数组
        int[] arr2 = new int[4];
        printArray(arr2);
        printArray(new int[4]);
        System.out.println("\n"+"======================");
        int[] arr3 = new int[]{1,2,3,4};

        printArray(new int[]{1,2,3,4});
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
