package 递归求和;
/*
递归求 1 + 2 + 3 + ... + 10
 */
public class Test {
    public static void main(String[] args) {
        int n = 10;
        int result = factorSum(n);
        System.out.println(result);
    }

    public static int factorSum(int n) {
        if(n == 1){
            return 1;
        }
        return factorSum(n-1) + n;
    }
}
