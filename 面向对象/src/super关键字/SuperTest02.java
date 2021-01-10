package super关键字;
/*
    在恰当的时候使用:super(实际参数)
 */

public class SuperTest02 {
    public static void main(String[] args) {
        CreditAccount2 ca = new CreditAccount2("1111",211,131);
    }
}
//账户
class Account {
    //银行账户类，
    //账户的属性，：账号，余额
    private String actno;
    private double balance;
    //构造方法
    public Account(){

    }
    public Account(String actno,double balance){
        this.actno = actno;
        this.balance = balance;
    }
    //getter and setter
    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
//信用账户 (子类)
class CreditAccount2 extends 继承.Account {
    //属性:信誉度,子类独有的特征,父类没有

    double credit;
    //构造方法
    public CreditAccount2(){

    }
    //我现在有一个构造方法,想要对父类的属性赋值,但由于父类的属性是私有的,不能直接访问赋值,就可以通过super()方法来实现


    public CreditAccount2(String actno,double balance, double credit) {
        super(actno,balance);
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}