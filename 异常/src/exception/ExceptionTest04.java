package exception;
/*
只要异常没有捕捉,采用上报的方式,此方法的后续代码不会执行,
另外需注意:try语句块中的某一行出现异常,改行后面的代码不会执行,try..catch捕捉之后,catch语句块里里面的代码可以执行.
 */
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
处理异常的第一种方式,使用throws.
 */
public class ExceptionTest04 {
    public static void main(String[] args) {
        m1();
    }

    private static void m1() {
        try {
            m2();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void m2() throws FileNotFoundException {
        m3();
    }

    private static void m3() throws FileNotFoundException {
        new FileOutputStream("D:\\qq\\text.txt");
    }

}
