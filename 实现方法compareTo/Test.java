package 实现方法compareTo;

public class Test {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hellO";
        int result = compareTo(s1,s2);
        System.out.println(result);
    }

    public static int compareTo(String s1, String s2) {
        int s1Length = s1.length();
        int s2Length = s2.length();
        int minLength = Math.min(s1Length,s2Length);
        char[] s1Chars = s1.toCharArray();
        char[] s2Chars = s2.toCharArray();
        int value = 0;
        while(value < minLength){
            if(s1Chars[value] != s2Chars[value]){
                return s1Chars[value] - s2Chars[value];
            }
            value++;
        }
        return s1Length - s2Length;
    }

}
