package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
try ... catch深入
1,catch语句里面的参数可以是该异常类型,也可以是该异常类型的父类型.
2,建议catch的时候,异常一个一个处理,这样更能发现异常的存在
3,catch写多个的时候,必须是从小到大,从上到下的原则
 */
public class ExceptionTest05 {
    public static void main(String[] args) {
        try {
            FileInputStream fis =  new FileInputStream("D:\\qq\\text.txt");
            fis.read();
        } catch (FileNotFoundException e) {
            //打印异常追踪信息这个方法不能省略,一省略就不能发现异常信息了
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
        }
    }
}
