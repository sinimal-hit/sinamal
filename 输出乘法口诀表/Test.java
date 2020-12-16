package 输出乘法口诀表;

public class Test {
    public static void PrintMultiplicationTip(int num){
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                int product = i*j;
                System.out.printf("%d * %d = %d\t",i,j,product);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        PrintMultiplicationTip(9);
    }
}
