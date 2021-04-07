package 枚举;
/*
    这个程序没有使用java程序中的枚举,
    分析以下程序,在设计上有什么缺陷

 */
public class EnumTest01 {
    public static void main(String[] args) {
        int a = 18;
        int b = 0;
        System.out.println(divide2(a,b)?"计算成功":"计算失败");
    }
    //设计缺陷,在这个方法的返回值类型上,返回一个int不恰当,既然最后的结果只是成功和失败,那最好使用布尔类型,来表示两种不同的状态
    public static int divide1(int a,int b){
        try {
            int c = a/b;
            return 1;//执行到这说明执行没发生问题呢,不会报错
           // return 10;返回10已经偏离了需求,但编译器并没有检测出来,而我们追求的是所有的错误尽可能让编译器
        }catch (Exception e){
            return 0;//执行到这就发生异常,返回0
        }
    }

    //这种设计是不错的
    public static boolean  divide2(int a,int b){
        try {
            int c = a/b;
            return true;
        }catch (Exception e){
            return false;
        }
    }

    /*
        以上的方法设计没有毛病,挺好的,返回true和false两种情况
        但是在以后的开发中,有可能遇到一个方法的执行结果返回三中不同的情况,四种情况,5中情况.
        但是每一个都哦是可以数清楚的,一枚一枚都可以列举出来.这时候boolean类型已经不能满足需求了
        这时候就需要java语言中的枚举类型了.
     */
}
