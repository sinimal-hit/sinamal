package string;


/**
 * String 类型的构造方法
 * 1,String s = ""; 最常用
 * 2,String s = new String("");
 * 3,String s = new String(char数组);
 * 4,String s = new String(char数组,起始下标,长度)
 * 5,String s = new String(byte数组);
 * 6,,String s = new String(byte数组,起始下标,长度);
 */
public class StringTest04 {
    public static void main(String[] args) {
        byte[] bytes = {97,98,99};
        String s1 = new String(bytes);
        System.out.println(s1);//abc

        String s3 = new String(bytes,1,2);
        System.out.println(s3);//表示从第一个元素起始位置开始,长度为2,将byte数组的一百部份转化为字符串


        char[] chars = {'中','国','人'};
        String s2 = new String(chars);
        System.out.println(s2); //中国人
    }

}
