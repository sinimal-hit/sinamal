package random;

import java.util.Arrays;
import java.util.Random;

/*
编写程序,生成5个不重复的随机数,重复的话随机生成
最终生成的5个随机数放到数组当中,要求数组中的5个元素不重复
 */
public class RandomTest02 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        int index = 0;
        while (index<arr.length){
           int num = random.nextInt(101);
           //判断数组中是否偶含有这个元素

            if(!contains(arr,num)){
                arr[index++] = num;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    /**
     *
     * @param arr 数组
     * @param key 元素  需要判断该元素是否在数组当中,通过二分查找的方式进行
     * @return  true  表示存在,false 表示不存在
     */
    public static boolean contains(int[] arr,int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return true;
            }

        }
        return false;
    }
}
