package 数字9出现的次数;
/*
     1到 100 的所有整数中出现多少个数字9
     99需要另外计算，出现两次,还有90，91，92，93，94，95---99
     i%9 == 0；则这个这个数中有9
 */
public class Test {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 101; i++) {
            if(i % 9 == 0){
                count++;
            }
            if(i / 9 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}

