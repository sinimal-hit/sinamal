package string;

public class StringTest02 {
    public static void main(String[] args) {
        String s1 = "hello";
        //这个hello是存在字符串常量池中的，所以要使用直接拿来用。
        String s2 = "hello";
        System.out.println(s1==s2);

        String x = new String("xyz");
        String y = new String("xyz");
        System.out.println(x == y);//false
        //双等号不保险。所以就需要equals
        System.out.println(x.equals(y));
    }
}
