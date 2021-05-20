package Threadsafe2.Threadsafe;

public class AccountThreadTest {
    public static void main(String[] args) {
        Account act = new Account("act-001",10000);
        Thread t1 = new AccountThread(act);
        Thread t2 = new AccountThread(act);

        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
