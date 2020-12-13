package 打印素数;
/*
    打印 1 - 100 之间所有的素数
 */
public class Test {
    public static boolean isPrime(int n){
        if(n <= 2){
            return true;
        }
        if(n % 2 == 0){
            return false;
        }
        for (int i = 3; i < n; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }
}
