package 实现方法contains;

public class Test {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "llo";
        boolean flag = contains(s1,s2);
        System.out.println(flag);
    }

    public static boolean contains(String s1, String s2) {
        char[] bigChars = s1.toCharArray();
        char[] smallChars = s2.toCharArray();
        for (int i = 0; i < bigChars.length; i++) {
            //设一个临时变量temp,当temp的值增加到小数组的长度,说明大s1字符串中中含有s2字符串
            int temp = i;
            for (int j = 0; j < smallChars.length; j++) {
                if(bigChars[temp] == smallChars[j]){
                    temp++;
                }
                if(temp - i == smallChars.length){
                    return true;
                }

            }
        }
        return false;
    }
}
