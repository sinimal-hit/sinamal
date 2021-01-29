package Object类;

import sun.nio.cs.ext.MacTurkish;

/*
    判断两个基本数据类型是否相等直接使用"=="来比较
    但是判断引用数据类型就不能使用"=="来比较,但是在Object类中的equals()方法默认采用的是"=="来比较两个对象是相等
    所以Object类中的方法也不够用
 */
public class Test02 {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;
        System.out.println(a == b);
        String str1 = "nisni";
        String str2 = "nisni";
        boolean flag = str1.equals(str2);
        System.out.println(flag);
        /* -------------------------------- */
        MyTime m1 = new MyTime(1970,1,1); // MyTime m1 = 0x1234
        MyTime m11 = m1;
        MyTime m2 = new MyTime(1970,1,1); // MyTime m2 = 0x3435;
        //这里的"=="判断的是m1中保存的对象内存地址和m2中保存的对象内存地址是否相等
        System.out.println(m1 == m11);//true
        System.out.println(m1 == m2); //false
        System.out.println(m1.equals(m2));
    }
}
class MyTime{
    int year;
    int month;
    int day;

    public MyTime() {
    }

    public MyTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    //Object中默认的equals()方法这里返回的还是内存地址
    //如果我们需要调用equals方法就需要重写
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj instanceof  MyTime){
            MyTime my = (MyTime) obj;
            int year2 = ((MyTime) obj).year;
            int month2 = ((MyTime) obj).month;
            int day2 = ((MyTime) obj).day;
            if(this.year == year2 && this.day == day2 && this.month == month2){
                return true;
            }
        }
        return false;


    }
}
