package foreach;
/*
    JDK1.5之后推出了一个新特性,叫做增强for循环,或者叫做foreach
        有一个缺点,没有下标.在需要下标进行循环的时候,建以使用普通for循环
 */
public class ForEachTest01 {
    public static void main(String[] args) {
        int[] arr = {11,2,3,4,2,42};

        //遍历数组(普通for循环)
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        //增强for循环
        /**
         * for(元素类型 变量名 :  数组或集合){
         *     System.out.print(变量名);
         * }
         */
        for (int data : arr){
            //data是数组中的元素
            System.out.println(data);
        }
    }
}
