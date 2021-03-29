package integer;

public class IntegerTest04 {
    public static void main(String[] args) {
        //自动装箱
        Integer i = 100;

        //自动拆箱
        int k = i;

        /**
         *  java中为了提高程序的执行效率,将[-128到127]之间的包装类类型对象提前创建好,放到了一个方法区内存中的
         *  "整数型常量池"当中了,目的是要用这个区间的数据的时候就不再new,直接从字符串常量池中取出来.
         *  
         */
        Integer x = 1234;
        Integer y = 1234;
        System.out.println(x == y);//false

        Integer a = 123;
        Integer b = 123;
        System.out.println(a == b);//true

    }
}
