package Homework;
/*
    编写一个方法，输出大于某个正整数n的最小质数
        比如：这个正整数n 是2；
        也就是要输出：大于2的最小的值数，结果就是3.
 */
public class HomeworkTest01 {
    public static void main(String[] args) {
        int n = 5;
        while(true){
            n++;
            if(isPrimeNum(n)){
                System.out.println(n);
                break;
            }
        }
    }

    public static boolean isPrimeNum(int n) {
        //质数只能被1 和自身整除
        for (int i = 2; i < n ; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
