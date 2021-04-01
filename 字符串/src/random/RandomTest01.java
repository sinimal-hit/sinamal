package random;

import java.util.Random;

public class RandomTest01 {
    public static void main(String[] args) {
        Random random = new Random();
        //随机产生int类型取值范围内的随机数
        int num1 = random.nextInt();
        System.out.println(num1);

        //产生[0-100]之间的随机数,不能产生101
        //nextInt翻译为下一个int类型的数据时101,不包括101
        int num2 =  random.nextInt(101);
        System.out.println(num2);
    }
}
