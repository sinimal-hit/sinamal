package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
关于try..catch中的finally子句
    1,在finally子句中的代码是最后执行的,并且一定会执行,即使使用try语句块中的代码出现了异常
        finally子句必须try语句同时使用,不能单独使用
    2,finally语句通常使用在什么情况下呢?
        通常在finally中完成资源的释放和关闭
        因为finally语句块中的代码有保障.
        即使try语句块中的代码出现异常,finally语句块中的代码也会执行.
 */
public class ExceptionTest07 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:\\qq\\阶段学习课件\\C语言课件V3\\初级\\第0节-课前准备.pdf");

            String s = null;
            s.toString();

            //流完成需要关闭,即使以上程序出现了异常,流也需要关闭,放在这里有可能关不了.
            //fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (NullPointerException e){
            e.printStackTrace();
        }finally {
            if(fis != null){//避免空指针异常
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
