package integer;

public class IntegerTest05 {
    public static void main(String[] args) {
        //String --> int
        String s1 = "100";
        int i1 = Integer.parseInt(s1);
        System.out.println(i1 + 1); //101

        //int --> String
        String s2 = i1 + ""; //"100" 字符串
        System.out.println(s2 + 1); // 字符串拼接  "1001"


        //int  --> Integer
        Integer x = 1000;//自动装箱


        //Integer --> int
        int y = x;       //自动拆箱

        //String --> Integer
        Integer k = Integer.valueOf("123");

        //Integer --> String
        String s = String.valueOf(k);
    }
}
