package 实现方法replace;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String str = "www.baidu.com";
        String newStr = replace(str,"baidu","google");
        System.out.println(newStr);
    }

    public static String replace(String str, String target, String replacement) {
        int index = str.indexOf(target);
        String s1 = str.substring(0,index);
        String s2 = str.substring(index+target.length());
        return s1+replacement+s2;
    }
}
