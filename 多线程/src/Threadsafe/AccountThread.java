package Threadsafe;

public class AccountThread extends Thread{
    private Account act;

    public AccountThread(Account act){
        this.act = act;
    }

    public void run(){
        act.withdraw(5000);
        System.out.println(Thread.currentThread().getName()+"对" + act.getActnu()+"取款成功" +
                "余额:"+ act.getBalance());
    }
}
