package 输出闰年;

import com.sun.corba.se.impl.orbutil.ObjectUtility;

public class Test {
    public static void main(String[] args) {
        for (int i = 1000; i < 2000; i++) {
            boolean isRun = ((i % 100 != 0 && i % 4 == 0)|| i % 400 == 0);
            if(isRun){
                System.out.println(i+"是闰年");
            }
        }
    }
}
