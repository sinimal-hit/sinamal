package 计算分数的值;
/*
    计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
 */
public class Test {
    public static void main(String[] args) {
        double sum = 0;
        for (double i = 1.0; i <= 100; i++){
            int flag = -1;
            if(i % 2 == 0){
                sum -= 1/i;
            }
            else {
                sum += 1/i;
            }
        }
        System.out.println(sum);
    }
}
