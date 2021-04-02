package string;

import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1==s2);

        char[] chars = {'a','b','v'};

        System.out.println(new String(chars));
        String s3 = "nihao";
        char[] chars1= s3.toCharArray();
        System.out.println(Arrays.toString(chars1));
        byte[] bytes =   s3.getBytes();
        System.out.println(Arrays.toString(bytes));

        int i = 100;
        String s4 = String.valueOf(i);
        System.out.println(s4);

        String[] str = new String("2000-10-10").split("-");

        System.out.println(Arrays.toString(str));
        String s6 = "2000-10-10";
        System.out.println(s6.indexOf("-"));
    }
}
