package Threadsafe;
/*
银行账户
    不使用线程同步机制,多线程对同一个账户进行取款,出现线程安全问题
 */
public class Account {
    private String actnu;
    private double balance;

    public Account(String actnu, double banlance) {
        this.actnu = actnu;
        this.balance = banlance;
    }

    public Account() {
    }

    public String getActnu() {
        return actnu;
    }

    public void setActnu(String actnu) {
        this.actnu = actnu;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //取款的方法
    public void withdraw(double money){
        //取款之前的余额
        double before = this.getBalance();
        //取款之后的余额
        double after = before - money;
        //更新余额
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setBalance(after);
    }
}
