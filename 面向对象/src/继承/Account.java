package 继承;

public class Account {
    //银行账户类，
    //账户的属性，：账号，余额
    private String actno;
    private double balance;
    public Account(){

    }
    public Account(String actno,double balance){
        this.actno = actno;
        this.balance = balance;
    }

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
