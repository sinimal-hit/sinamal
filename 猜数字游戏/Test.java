package 猜数字游戏;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int toGuess = random.nextInt(100)+1;
        while(true){
            int input = scanner.nextInt();
            if(input > toGuess){
                System.out.println("猜大啦");
            }
            if(input < toGuess){
                System.out.println("小啦");
            }
            if(input == toGuess){
                System.out.println("恭喜你猜对啦");
                break;
            }
        }
    }
}
