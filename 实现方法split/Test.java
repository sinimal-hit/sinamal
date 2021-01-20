package 实现方法split;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
实现方法 split, 能够指定分割符将字符串拆分成字符串数组(不必支持正则表达式)
 */
public class Test {
    public static void main(String[] args) {
        String str = "2000-10-10";
        String[] arr = mySplit(str,"-");
        System.out.println(Arrays.toString(arr));
    }

    public static String[] mySplit(String str, String s) {
        List list = new ArrayList();
        while(str.contains(s)){
            int index = str.indexOf(s);
            String temp = str.substring(0,index);
            list.add(temp);
            str = str.substring(index+s.length());
        }
        list.add(str);
        String[] arr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = (String) list.get(i);
        }
        return arr;
    }
}
