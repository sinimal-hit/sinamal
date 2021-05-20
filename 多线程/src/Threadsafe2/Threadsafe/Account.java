package Threadsafe2.Threadsafe;
/*
银行账户
    使用线程同步机制解决线程安全问题

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
        //以下这几行代码必须是线程同步的(线程排队),不能并发
        //一个线程把这里的代码执行完毕之后,另一个线程才能出来
        /*
        线程同步机制的语法是
            synchronized(){
                //线程同步代码块
            }
            synchronized后面小括号中传入的"数据"是相当关键的,
            这个数据必须是多线程共享的数据,才能达到线程排队

            ()中写什么?
                那要看你想要那些线程同步.
                假设t1,t2,t3,t4,t5.有5个线程
                只希望t1,t2,t3排队,t4,t5不需要排队,怎么办
                一定要在()写一个t1,t2,t3共享的对象,而这个对象对于t4,和t5来说不是共享的

            这里的共享对象是:账户对象
            账户对象是共享的,那么this就是账户对象!!!!

        在java语言当中,任何一个对象都有一把"锁",其实这把锁就是标记,(只是把它叫做锁)
        100个对象,100把锁,1个对象一把锁

        以下对象的执行原理是:
            1,假设t1和t2线程并发,开始执行以下代码的时候,肯定有一个先有一个后.
            2,假设t1先执行了,遇到了synchronized,这个时候t1自动寻找"后面共享对象"的对象锁
                找到之后,并且占有这把锁,然后执行同步代码块中的程序,在程序执行过程中,一直都是
                占用这把锁的,直到同步代码块执行结束,这把锁才会释放
            3,假设t1已经占有了这把锁,此时t2也遇到了synchronized关键字,也会去占有后面共享对
                象的这把锁,结果这把锁被t1线程已经占有了,这个时候,t2只能在同步线程代码块之外等待
                线程ti的结束,直到t1把同步代码块执行结束了,t1会归还这把锁,此时t2终于等到了这把锁
                然后t2占有这把锁之后,进入同步代码块中执行

            这样就达到了线程排队执行
            这里需要注意的是:这个共享对象一定要选好了,这个共享对象一定是你需要排队执行的这些线程
                共享的.


         */
        synchronized(this){
        //synchronized (obj){
        Object obj1 = new Object();
        //synchronized (obj1){//这样写线程就不是安全的了,因为obj1是局部变量,不是共享对象.
            double before = this.getBalance();
            double after = before - money;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setBalance(after);
        }
    }
}
