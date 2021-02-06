package 递归求斐波那契数列的第N项;

public class Test {
    public static void main(String[] args) {
        int result = fib(6);
        System.out.println(result);
    }

    public static int fib(int i) {
        if(i == 1 || i == 2){
            return 1;
        }
        return fib(i - 1) + fib(i - 2);
    }

}
