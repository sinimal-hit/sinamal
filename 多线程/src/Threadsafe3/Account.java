package Threadsafe3;
/*
在实例方法上使用synchronized:
    synchronized出现在实例方法上,一定锁的是this.
    没得挑,只能是this,不能是其他对象了.
    所以这种方式不灵活.

    另外还有一个缺点:synchronized出现在实例方法上:
    表示整个方法体都需要同步,可能会无故扩大同步范围,导致程序的执行效率较低,所以这种方式不常用.

    synchronized使用在实例代码上有什么优点
        代码写的少了,节俭了

    如果共享对象就是this,并且需要同步的代码块是整个方法体
    建议使用这种方式
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
    public synchronized void withdraw(double money){
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
