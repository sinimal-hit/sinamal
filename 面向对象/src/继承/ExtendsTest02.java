package 继承;
/*
    使用继承机制来解决代码的重复使用问题
 */
public class ExtendsTest02 {
    public static void main(String[] args) {
        Account act = new Account();
        act.setActno("111111");
        act.setBalance(1000000);
        System.out.println(act.getActno());
        System.out.println(act.getBalance());

        //创建信誉账户
        CreditAccount2 creditAccount2 = new CreditAccount2();
        creditAccount2.setActno("22222222");
        creditAccount2.setBalance(-1000000);
        creditAccount2.setCredit(0.99);
        System.out.println("账号："+creditAccount2.getActno()+"余额: "+creditAccount2.getBalance()
                +"信誉度："+creditAccount2.getCredit());
    }
}
class CreditAccount2 extends Account{
    double credit;
    public CreditAccount2(){

    }
    public CreditAccount2(double credit) {
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}
