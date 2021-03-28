package integer;

public class IntegerTest01 {
    public static void main(String[] args) {
        //123这个基本数据类型,进行了构造方法的包装达到了:基本数据类型向引用数据类型的转换
        //基本数据类型--->引用数据类型(装箱)
        Integer i = new Integer(123);

        //将引用数据类型---->基本数据类型(拆箱)

        float f = i.floatValue();
        System.out.println(f);//123.0
        int retValue = i.intValue();
        System.out.println(i);//123
    }
}
