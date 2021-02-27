package 章节练习;
/*
    数组的元素查询
    给定一个数组，和一个要查找的元素，返回一个这个元素对应的数组下标。
 */
public class ArrayTest04 {
    public static void main(String[] args) {
        int[] arr = {2,3,455,6,75};
        int pos = search(arr,3);
        System.out.println(pos);
    }

    public static int search(int[] arr, int toSearch) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == toSearch){
                return i;
            }
        }
        return -1;
    }
}
