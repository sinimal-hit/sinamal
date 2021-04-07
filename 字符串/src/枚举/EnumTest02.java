package 枚举;
/* re
采用枚举的方式改造程序

 */
public class EnumTest02 {
    public static void main(String[] args) {
        System.out.println(divide(10,2) == Result.SUCCESS?"计算成功":"计算失败");
    }
    public static Result divide(int a,int b){
        try{
            int c = a/b;
            return Result.SUCCESS;
        }catch (Exception e){
          return Result.FAIL;
        }
    }
}

/**
 * 枚举: 一枚一枚可以列举出来,才建议使用枚举类型
 * 枚举编译之后生成class文件
 * 枚举也是一种引用数据类型
 * 枚举中的每一个值可以看作是常量
 */
enum Result{
    //SUCCESS 是枚举类型中的一个值   FAIL以时Result类型
    //枚举中的每一个值,都可以看作是常量
    SUCCESS,FAIL
}
