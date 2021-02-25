package 章节练习;

import java.util.Arrays;

/*
    数组遍历
    查看数组的内容可以通过数组的遍历来进行观察
    遍历的方式不太方便，就可以通过把数组转化为字符串的方式来进行打印
    java标准库中在java.util 库中 Arrays.toString()方法可进行次操作
 */
public class ArrayTest01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        //将数组{1，2，3，4}打印成为[1,2,3,4]的格式
        System.out.println(Arrays.toString(arr));
        System.out.println(arrayToString(arr));
        System.out.println("================");
        System.out.println(arr);// 输出内容为：[I@14ae5a5  相当于一个对象的编号，并不是数组的内容
    }

    public static String arrayToString(int[] arr) {  //自己先实现数组转化为字符串的方式。
        String result = "[";
//        for(int x:arr){
//            result += (x + ",");
//        }
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
            if(i != arr.length - 1){
                result += ",";
            }
        }
        result += "]";//[1,2,3,4,]  需要去掉括号内的最后一个元素的逗号。
        return result;
    }

}
