package com.java;
/*

 */
public class RecursiveTest02 {
    public static void main(String[] args) {

        int sum = sum(3);
        System.out.println(sum);
        System.out.println(sumRecur(3));
    }
    //不适用递归来计算1---n的和
    public static int sum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
    //使用递归来计算1……n的值
    public static int sumRecur(int n){
        if(n == 1){
            return 1;
        }
        return n +sum(n -1);
    }
}
