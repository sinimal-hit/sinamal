package 返回的数字之和;
/*
写一个递归方法，输入一个非负整数，返回组成它的数字之和
 */
public class  Test {
    public static void main(String[] args) {
        int n = 1234;
        int result = func(n);
        System.out.println(result);
    }

    public static  int func(int n) {
        if(n < 10){
            return n;
        }
        return func(n / 10) + (n % 10);

    }
}
