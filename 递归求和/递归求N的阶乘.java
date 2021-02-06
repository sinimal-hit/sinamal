package 递归求和;
/*
递归求 N 的阶乘
 */
public class 递归求N的阶乘 {
    public static void main(String[] args) {
        int n = 5;
        int result = factor(n);
        System.out.println(result);
    }

    public static int factor(int n) {
        if(n == 1){
            return 1;
        }
        return factor(n -1) * n;
    }
}
