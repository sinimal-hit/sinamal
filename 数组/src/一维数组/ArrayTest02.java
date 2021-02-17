package 一维数组;
/*
    main方法中的String[]
 */
public class ArrayTest02 {
    public static void main(String[] args) {
        /*
            JVM默认传递过来的数组长度.  默认是 :0
            通过测试,:args不是null
         */
        System.out.println("JVM给传递过来的String[]参数,他这个数组的默认长度是:"+args.length);
        /*
            初始化一个数组,但是数组中没有任何数据
            ing[] strs = new String[0];
            printLength(strs); Str
         */
        //那这个数组什么时候会有值呢?
        //  其实这个数组是给用户的,用户可以在控制台上输入参数,这个参数自动会被转为"String[] args"
    }
    public static void printLength(String[] args){
        System.out.println(args.length);
    }
}
