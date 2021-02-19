package 一维数组;

import java.util.Arrays;

/*
    java数组的扩容
        需要创建一个新的大容量的数组,将需要扩容的数组放到该数组中.
    数组扩容效率较低,因涉及到拷贝问题,所以在开发中注意尽量不要对数组进行扩容
    System.arraycopy(5个参数)
 */
public class ArrayTest05 {
    public static void main(String[] args) {
        //将src中数组的元素拷贝到dest数组中
        //拷贝源
        int[] src = {1,11,22,3,4};
        //拷贝目标
        int[] dest = new int[20];
        //参数分别是 ①拷贝源,②拷贝源数组下标,也就是从第几个数组开始拷贝  ③拷贝目标 ④拷贝目标数组下标,  ⑤拷贝长度
        System.arraycopy(src,1,dest,2,3);
        System.out.println(Arrays.toString(dest));

    }
}
