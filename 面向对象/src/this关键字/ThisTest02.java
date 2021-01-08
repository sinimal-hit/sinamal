package this关键字;

public class ThisTest02 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getYear()+"年"+date.getMonth()+"月"+date.getDay()+"日");
        Date date1 = new Date(1970,01,01);
        System.out.println(date1.getYear()+"年"+date1.getMonth()+"月"+date1.getDay()+"日");
    }
}
/*
    说无参构造方法中的初始值为1970-01-01；
 */
class Date{
    private int year;
    private int month;
    private int day;
    //构造方法
    public Date() {
       this(1970,1,1);
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //get set
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
