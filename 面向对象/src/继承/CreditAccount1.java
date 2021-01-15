package 继承;
/*
   分析以下CreditAccount1类中的代码存在什么问题？
        代码臃肿，和Account有很大类似，但并没有得到重复利用
 */
public class CreditAccount1 {




    //其他类型账户：信用卡账户
    //账号，余额，信誉度
    private String actno;
    private double balance;
    private double credit;

    public CreditAccount1() {

    }

    public CreditAccount1(String actno, double balance, double credit) {
        this.actno = actno;
        this.balance = balance;
        this.credit = credit;
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

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}
