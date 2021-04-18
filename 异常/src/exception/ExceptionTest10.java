package exception;
/*
finally面试题
 */
public class ExceptionTest10 {
    public static void main(String[] args) {
        int result = m();
        System.out.println(result);//100
    }
    /*
    java语法规则(有一些规则是不能被破坏的,一旦这么说了,就必须这么做!!)
        java中有一条这样的规则
            方法体中的代码必须遵循自上而下的顺序一次逐步执行(亘古不变的道理)
        java还有一条语法规则:
            return 语句一旦执行,整个方法必须执行.
     */
    public static int m(){
        int i = 100;
        try{
            //这行代码出现在 int i = 100; 的下面,所以最终结果必须返回100;
            //return语句必须保证最后执行的,一旦执行,整个方法结束
            return i;
        }finally {
            i++;
        }
    }
}
