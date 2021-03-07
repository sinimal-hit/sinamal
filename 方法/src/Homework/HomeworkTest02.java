package Homework;
/*
    编写一个程序，用循环打印如下数值表
    1 10 100 1000
    2 20 200 2000
    3 30 300 3000
 */
public class HomeworkTest02 {
    public static void main(String[] args) {
        printValue(5);
    }

    public static void printValue(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i +" " + i*10 + " " + i*100 + " " + i * 1000);
        }
    }
}
