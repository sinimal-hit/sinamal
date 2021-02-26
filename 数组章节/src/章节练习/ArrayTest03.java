package 章节练习;
/*
    数组元素比较大小
 */
public class ArrayTest03 {
    public static void main(String[] args) {
        int[] arr = {2432,54,564,64,123312};
        int result = max(arr);
        System.out.println(result);
    }

    public static int max(int[] arr) {
        int temp = arr[0];
        for (int value : arr) {
            if (value > temp) {
                temp = value;
            }
        }
        return temp;
    }
}
